package dao.mapper;

import dao.model.Good;
import dao.model.GoodExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by GeniusV on 6/6/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-spring-mybatis.xml")
public class GoodMapperTest {

    @Autowired
    GoodMapper goodMapper;

    @Test
    public void queryGoods() {
        List<Good> result = goodMapper.selectByExample(new GoodExample());
        for (Good good : result) {
            System.out.println(good.toString());
        }
    }
}