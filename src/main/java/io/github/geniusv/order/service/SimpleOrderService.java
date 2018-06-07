package io.github.geniusv.order.service;

import io.github.geniusv.dao.mapper.GoodMapper;
import io.github.geniusv.dao.mapper.OrderMapper;
import io.github.geniusv.dao.mapper.UserMapper;
import io.github.geniusv.dao.model.GoodExample;
import io.github.geniusv.dao.model.Order;
import io.github.geniusv.dao.model.OrderExample;
import io.github.geniusv.good.serivce.GoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.debugger.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GeniusV on 6/7/18.
 */

@Service
public class SimpleOrderService implements OrderService {
    private Logger logger = LoggerFactory.getLogger("OrderService");

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public boolean createOrder(Long userId, Long goodId) {
        if (userMapper.selectByPrimaryKey(userId) == null) {
            logger.warn("UserId: \" " + userId + "\" not exist!!");
            return false;
        }

        if (goodMapper.selectByPrimaryKey(goodId) == null) {
            logger.warn("UserId: \" " + goodId + "\" not exist!!");
            return false;
        }

        Order order = new Order();
        order.setGood(goodId);
        order.setUserId(userId);
        order.setNum(1);
        return orderMapper.insert(order) > 0;
    }

    @Override
    public List<Order> selectUserOrder(Long userId, Long page) {
        OrderExample orderExample = new OrderExample();
        orderExample.setOrderByClause("id desc");
        orderExample.or().andUserIdEqualTo(userId);
        List<Long> idList = orderMapper.selectPrimaryKeyLimitedByExample(page * 10, 10L, orderExample);
        List<Order> result = new ArrayList<>();
        for (Long id : idList) {
            result.add(orderMapper.selectByPrimaryKey(id));
        }
        return result;
    }

    @Override
    public Long getPageNum(Long userId) {
        OrderExample orderExample = new OrderExample();
        orderExample.or().andUserIdEqualTo(userId);
        Long ct = orderMapper.countByExample(orderExample);
        Long page = ct / 10;
        if (ct % 10 != 0) {
            return page + 1;
        }
        return page;    }



    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public OrderMapper getOrderMapper() {
        return orderMapper;
    }

    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }
}
