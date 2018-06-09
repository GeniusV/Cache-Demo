package io.github.geniusv.controller;

import io.github.geniusv.dao.model.Good;
import io.github.geniusv.dao.model.Order;
import io.github.geniusv.dao.model.User;
import io.github.geniusv.good.serivce.GoodService;
import io.github.geniusv.order.service.OrderDetailWrapper;
import io.github.geniusv.order.service.OrderService;
import io.github.geniusv.user.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by GeniusV on 8/5/17.
 */

@Controller
public class MainController {

    @Autowired
    private GoodService goodService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    public GoodService getGoodService() {
        return goodService;
    }

    public void setGoodService(GoodService goodService) {
        this.goodService = goodService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequiresAuthentication
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public ModelAndView getHome() {
        ModelAndView modelAndView = new ModelAndView("/test-home");
        Long userId = (Long) SecurityUtils.getSubject().getPrincipal();
        User user = userService.getUserById(userId);
        modelAndView.addObject("user", user);

        return modelAndView;
    }

    @RequiresAuthentication
    @RequestMapping(value = "order", method = RequestMethod.GET)
    public ModelAndView getOrder(@RequestParam(value = "page", required = false) Long page) {
        ModelAndView result = new ModelAndView("order");

        if (page == null) {
            page = 0L;
        } else {
            page--;
        }

        Long userId = (Long) SecurityUtils.getSubject().getPrincipal();

        List<Order> orderList = orderService.selectUserOrder(userId, page);

        List<OrderDetailWrapper> orderDetailWrapperList = new ArrayList<>();
        for (Order order : orderList) {
            orderDetailWrapperList.add(new OrderDetailWrapper(order, goodService));
        }

        result.addObject("orderList", orderDetailWrapperList);
        result.addObject("totalPage", orderService.getPageNum(userId));
        result.addObject("currentPage", page + 1);

        return result;
    }

    @RequestMapping(value = "404")
    public String requestNoFound() {
        return "/404";
    }


    @ExceptionHandler(value = {UnauthenticatedException.class, UnauthorizedException.class})
    public String exceptionHandler(HttpServletRequest request) {
        return "redirect:/login";
    }

    @RequestMapping(value = "/")
    public ModelAndView index(@RequestParam(value = "page", required = false) Long page) {
        ModelAndView modelAndView = new ModelAndView("/index");
        if (page == null) {
            page = 0L;
        } else {
            page--;
        }
        List<Good> goodList = goodService.selectGoodByPage(page);

        modelAndView.addObject("goodList", goodList);
        modelAndView.addObject("totalPage", goodService.getPageNum());
        modelAndView.addObject("currentPage", page + 1);

        return modelAndView;
    }

    @RequiresAuthentication
    @ResponseBody
    @RequestMapping(value = "/buy/{id}")
    public Map<String, Boolean> buy(@PathVariable Long id) {
        Map<String, Boolean> result = new HashMap<>();
        Long userId = (Long) SecurityUtils.getSubject().getPrincipal();
        result.put("success", orderService.createOrder(userId, id));
        return result;
    }

}
