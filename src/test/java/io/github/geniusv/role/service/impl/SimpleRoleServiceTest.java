package io.github.geniusv.role.service.impl;

import io.github.geniusv.dao.model.Role;
import io.github.geniusv.role.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 8/12/17.
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class SimpleRoleServiceTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void getUserRolesById() {
        long id = 1;
        List<Role> result = roleService.getUserRolesById(id);
        System.out.println(result.toString());
    }

}