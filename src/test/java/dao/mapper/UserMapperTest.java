package dao.mapper;

import dao.model.User;
import dao.model.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by GeniusV on 8/6/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:test-spring-mybatis.xml", "classpath:spring-redis.xml"})
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void selectPrimaryKeyByExample() {
        UserExample example = new UserExample();
        long num = 1;
        example.or().andStatusEqualTo(num);
        userMapper.selectByExample(example);
    }

    @Test
    public void testSelectPrimaryKeyLimitedByExample() {
        UserExample example = new UserExample();
        example.setOrderByClause("id DESC");
        for (Long i = 0L; i < 100; i = i + 5) {
            List<Long> list = userMapper.selectPrimaryKeyLimitedByExample(i, 5L, example);
            System.out.println(list);
        }
    }


    //    @Test
    public void add100User() {
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setUserName("user" + i);
            user.setPassword("test");
            user.setStatus(1L);
            userMapper.insert(user);
        }
    }

}