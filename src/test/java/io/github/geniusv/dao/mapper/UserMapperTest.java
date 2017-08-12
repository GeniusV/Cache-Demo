package io.github.geniusv.dao.mapper;

import io.github.geniusv.dao.model.User;
import io.github.geniusv.dao.model.UserExample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 8/12/17.
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectByPrimaryKey() {
        long id = 44444444;
        User user = userMapper.selectByPrimaryKey(id);
        Assert.assertNull(user);
    }

    @Test
    public void testDeleteByExample() {
        UserExample example = new UserExample();
        example.or().andUserNameEqualTo("fuck");
        userMapper.updateByExample(new User(), example);
    }

}