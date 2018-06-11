package io.github.geniusv.order.service;

import io.github.geniusv.dao.model.Good;
import io.github.geniusv.dao.model.Order;
import io.github.geniusv.good.serivce.GoodService;

/**
 * Created by GeniusV on 6/7/18.
 */
public class OrderDetailWrapper extends Order{
    private Good detailGood;
    private Order order;

    public OrderDetailWrapper(Order order, GoodService goodService){
        setId(order.getId());
        setNum(order.getNum());
        setUserId(order.getUserId());
        setGood(order.getGood());
        this.detailGood = goodService.selectGood(getGood());
    }

    public Good getDetailGood() {
        return detailGood;
    }
}
