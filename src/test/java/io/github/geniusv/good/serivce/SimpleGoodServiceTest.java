package io.github.geniusv.good.serivce;

import io.github.geniusv.dao.mapper.GoodMapper;
import io.github.geniusv.dao.model.Good;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by GeniusV on 6/6/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SimpleGoodServiceTest {

    @Autowired
    GoodMapper goodMapper;

    @Autowired
    GoodService goodService;

    @Test
    public void query() {
        List<Good> result = goodService.selectGood();
        for (Good good : result) {
            System.out.println(good.toString());
        }
    }


    @Test
    public void queryInPage() {
        List<Good> result = goodService.selectGoodByPage(0L);
        for (Good good : result) {
            System.out.println(good.toString());
        }
        Assert.assertEquals(15, result.size());
    }

    @Test
    public void queryNum() {
        Long result = goodService.getPageNum();

        Assert.assertEquals(new Long(3), result);
    }
}