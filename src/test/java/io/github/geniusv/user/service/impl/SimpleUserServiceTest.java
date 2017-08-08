package io.github.geniusv.user.service.impl;

import io.github.geniusv.dao.mapper.UserMapper;
import io.github.geniusv.dao.model.User;
import io.github.geniusv.user.service.UserService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * SimpelUserService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 5, 2017</pre>
 */

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SimpleUserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: insert(User record)
     */
    @Test
    public void testInsert() throws Exception {

                Assert.assertEquals("admin", userMapper.selectByPrimaryKey((long)1).getUserName());

    }

    /**
     * Method: selectByUserName(String userName)
     */


    @Test
    public void testSelectByUserName() throws Exception {
        long stat = 1;
        User user = new User();
        user.setUserName("test");
        user.setPassword("test");
        user.setStatus(stat);
        userMapper.insert(user);

//        Assert.assertEquals("admin", userService.selectByUserName("admin").getUserName());
    }


} 
