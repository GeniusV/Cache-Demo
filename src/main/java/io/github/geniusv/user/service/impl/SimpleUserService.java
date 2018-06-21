package io.github.geniusv.user.service.impl;

import io.github.geniusv.dao.mapper.RoleMapper;
import io.github.geniusv.dao.mapper.UserMapper;
import io.github.geniusv.dao.mapper.UserRoleMapper;
import io.github.geniusv.dao.model.User;
import io.github.geniusv.dao.model.UserExample;
import io.github.geniusv.user.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GeniusV on 8/5/17.
 */


@Service
public class SimpleUserService implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RoleMapper roleMapper;

    public User getUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public User selectByUserName(String userName) {
        UserExample example = new UserExample();
        example.or().andUserNameEqualTo(userName);

        List<User> list = userMapper.selectByExample(example);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public void addUser(User user) {
        LoggerFactory.getLogger(getClass()).debug("Adding user:[{}]", user);
        userMapper.insertSelective(user);
    }

    @Override
    public List<User> getAllUsersByPage(Long offset, Long num) {
        UserExample example = new UserExample();
        example.setOrderByClause("id");
        List<Long> idList = userMapper.selectPrimaryKeyLimitedByExample(offset, num, example);

        example = new UserExample();
        example.or().andIdIn(idList);
        return userMapper.selectByExample(example);
    }

    @Override
    public Long getUserCount() {
        return userMapper.countByExample(new UserExample());
    }

    @Override
    public void deleteUser(List<Long> idList) {
        UserExample example = new UserExample();
        example.or().andIdIn(idList);
        userMapper.deleteByExample(example);
    }

    @Override
    public void updateUserInfo(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}




