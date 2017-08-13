package io.github.geniusv.controller;

import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 8/13/17.
 */
@Controller
public class AdminContorller {

    @RequiresRoles("admin")
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage() {
        return "admin";
    }

    @ExceptionHandler(value = {UnauthenticatedException.class, UnauthorizedException.class})
    public String exceptionHandler(HttpServletRequest request) {
        return "redirect:/404";
    }
}
