package io.github.geniusv.role.service.impl;

import com.sun.xml.internal.ws.message.RootElementSniffer;
import io.github.geniusv.dao.exception.RecordNoFoundException;
import io.github.geniusv.dao.mapper.RoleMapper;
import io.github.geniusv.dao.mapper.UserMapper;
import io.github.geniusv.dao.mapper.UserRoleMapper;
import io.github.geniusv.dao.model.Role;
import io.github.geniusv.dao.model.RoleExample;
import io.github.geniusv.dao.model.UserRole;
import io.github.geniusv.dao.model.UserRoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import io.github.geniusv.role.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 8/12/17.
 */
@Service
public class SimpleRoleService implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public void addRoleToUser(Long RoleId, Long userId) {

        if (roleMapper.selectByPrimaryKey(RoleId) == null) {
            throw new RecordNoFoundException(String.format("There is no role with id:\"%s\"", RoleId.toString()));
        }

        if (userMapper.selectByPrimaryKey(userId) == null) {
            throw new RecordNoFoundException(String.format("There is no user with id:\"%s\"", userId.toString()));
        }

        UserRole userRole = new UserRole();
        userRole.setRoleId(RoleId);
        userRole.setUserId(userId);
        userRoleMapper.insert(userRole);
    }

    @Override
    public void deleteRoleFromUser(Long roleId, Long userId) {
        UserRoleExample example = new UserRoleExample();
        example.or().andRoleIdEqualTo(roleId).andUserIdEqualTo(userId);
        int result = userRoleMapper.deleteByExample(example);
        if (result == 0) {
            throw new RecordNoFoundException(String.format("User[id:\"%s\"] with role[id:\"%s\"] not exist", userId.toString(), roleId.toString()));
        }
    }

    @Override
    public List<Role> getUserRolesById(Long userId) {
        List<Role> result = null;
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.or().andUserIdEqualTo(userId);
        List<UserRole> userRoleList = userRoleMapper.selectByExample(userRoleExample);
        if (userRoleList == null || userRoleList.isEmpty()) {
            return null;
        }

        // get roleId in each Userole and put them into the roleIdList
        List<Long> roleIdList = userRoleList.stream().map(UserRole::getRoleId).collect(Collectors.toList());

        RoleExample roleExample = new RoleExample();
        roleExample.or().andIdIn(roleIdList);
        result = roleMapper.selectByExample(roleExample);
        return result;
    }


    public RoleMapper getRoleMapper() {
        return roleMapper;
    }

    public void setRoleMapper(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }


    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserRoleMapper getUserRoleMapper() {
        return userRoleMapper;
    }

    public void setUserRoleMapper(UserRoleMapper userRoleMapper) {
        this.userRoleMapper = userRoleMapper;
    }
}
