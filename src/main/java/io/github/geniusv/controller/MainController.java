package io.github.geniusv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by GeniusV on 8/5/17.
 */

@Controller
public class MainController {

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String getHome() {
        return "/test-home";
    }


    @RequestMapping(value = "404")
    public String requestNoFound() {
        return "/404";
    }
}
