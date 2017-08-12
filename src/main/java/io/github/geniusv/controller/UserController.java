package io.github.geniusv.controller;

import io.github.geniusv.dao.model.User;
import io.github.geniusv.user.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GeniusV on 8/4/17.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequiresGuest
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginpage() {
        return "user/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> login(@ModelAttribute("userName") String userName, @ModelAttribute("password") String password) {
        Map<String, Object> data = new HashMap<String, Object>();

        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);


        Subject subject = SecurityUtils.getSubject();


        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            data.put("error", "User name or password error.");
        }

        data.put("redirect", "/home");

        return data;
    }

    @RequestMapping(value = "user/subject", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getCurrentUser() {
        Map<String, Object> data = new HashMap<String, Object>();
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            Long id = (Long) subject.getPrincipal();
            User user = userService.getUserById(id);
            data.put("id", user.getId());
            data.put("userName", user.getUserName());
        }
        return data;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login";
    }

    @RequiresRoles("admin")
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage() {
        return "admin";
    }

}
