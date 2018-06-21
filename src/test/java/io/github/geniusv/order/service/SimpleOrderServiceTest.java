package io.github.geniusv.order.service;

import io.github.geniusv.dao.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.PrintWriter;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by GeniusV on 6/7/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SimpleOrderServiceTest {

    @Autowired
    OrderService orderService;

    @Test
    public void orderInsert() {
        boolean result = orderService.createOrder(1L, 2L);

        assertEquals(true, result);
    }


    @Test
    public void testQueryNormal() {
        List<Order> result = orderService.selectUserOrder(1L, 2L);

        assertEquals(10, result.size());

        System.out.println(result);

    }

    @Test
    public void testQueryNoUser() {
        List<Order> result = orderService.selectUserOrder(100000L, 2L);

        assertEquals(0, result.size());

        System.out.println(result);

    }
}