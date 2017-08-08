package dao.mapper;

import dao.model.UserExample;
import io.github.geniusv.util.LoggerUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
        LoggerUtil.debug(getClass(), userMapper.selectPrimaryKeyByExample(example).toString());
//        LoggerUtil.debug(getClass(), "dsfdsfdsf");
        LoggerUtil.debug(getClass(), userMapper.selectPrimaryKeyByExample(example).toString());
        LoggerUtil.debug(getClass(), userMapper.selectPrimaryKeyByExample(example).toString());
        LoggerUtil.debug(getClass(), userMapper.selectPrimaryKeyByExample(example).toString());
        LoggerUtil.debug(getClass(), userMapper.selectPrimaryKeyByExample(example).toString());
        LoggerUtil.debug(getClass(), userMapper.selectPrimaryKeyByExample(example).toString());
        LoggerUtil.debug(getClass(), userMapper.selectPrimaryKeyByExample(example).toString());
        LoggerUtil.debug(getClass(), userMapper.selectPrimaryKeyByExample(example).toString());
        LoggerUtil.debug(getClass(), userMapper.selectPrimaryKeyByExample(example).toString());

    }

}