package io.github.geniusv.order.service;

import io.github.geniusv.dao.model.Order;

import java.util.List;

/**
 * Created by GeniusV on 6/7/18.
 */
public interface OrderService {
    boolean createOrder(Long userId, Long goodId);

    List<Order> selectUserOrder(Long userId, Long page);

    Long getPageNum(Long userId);

}
