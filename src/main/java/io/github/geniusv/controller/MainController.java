package io.github.geniusv.controller;

import io.github.geniusv.dao.model.Good;
import io.github.geniusv.good.serivce.GoodService;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by GeniusV on 8/5/17.
 */

@Controller
public class MainController {

    @Autowired
    private GoodService goodService;

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

}
