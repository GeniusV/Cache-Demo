package io.github.geniusv.controller;

import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by GeniusV on 8/5/17.
 */

@Controller
public class MainController {

    @RequiresAuthentication
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String getHome() {
        return "/test-home";
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
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/index");

        return modelAndView;
    }
}
