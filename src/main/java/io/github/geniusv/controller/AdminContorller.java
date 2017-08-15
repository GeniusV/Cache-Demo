package io.github.geniusv.controller;

import io.github.geniusv.dao.model.User;
import io.github.geniusv.user.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 8/13/17.
 */
@Controller
public class AdminContorller {

    @Autowired
    UserService userService;

    @RequiresRoles("admin")
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage() {
        return "admin";
    }

    @ExceptionHandler(value = {UnauthenticatedException.class, UnauthorizedException.class})
    public String exceptionHandler(HttpServletRequest request) {
        return "redirect:/404";
    }

    @RequestMapping(value = "/admin/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers(@Param("offset") Long offset, @Param("num") Long num) {
        List<User> result = new ArrayList<>();
        result = userService.getAllUsersByPage(offset, num);
        return result;
    }

    @RequestMapping(value = "/admin/usersCount", method = RequestMethod.GET)
    @ResponseBody
    public List<Long> getCount() {
        Long count = userService.getUserCount();
        List<Long> result = new ArrayList<>();
        result.add(count);
        return result;
    }

}
