package io.github.geniusv.controller;

import io.github.geniusv.dao.model.User;
import io.github.geniusv.user.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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
    public Map<String, Object> login(@ModelAttribute("userName") String userName, @ModelAttribute("password") String password, @ModelAttribute("rememberMe") boolean rememberMe) {

        Map<String, Object> data = new HashMap<String, Object>();

        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        token.setRememberMe(rememberMe);

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

        if (subject.getPrincipal() != null) {
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

    @ResponseBody
    @RequestMapping(value = "user/subject", method = RequestMethod.POST)
    public Map<String, Object> addUser(@Param("userName") String userName, @Param("password") String password, @Param("status") Long status) {
        Map<String, Object> data = new HashMap<String, Object>();
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setStatus(status);
        try {
            userService.addUser(user);
        } catch (Exception e) {
            data.put("error", "Add user failed");
            LoggerFactory.getLogger(getClass()).warn("", e);
        }
        data.put("info", "Add user success");
        return data;
    }

    @RequiresRoles("admin")
    @ResponseBody
    @RequestMapping(value = "user/subject", method = RequestMethod.DELETE)
    public Map<String, Object> deleteUser(@RequestBody List<Long> ids) {
        Map<String, Object> result = new HashMap<>();
        try {
            userService.deleteUser(ids);
        } catch (Exception e) {
            result.put("error", "Delete user failed");
            LoggerFactory.getLogger(getClass()).warn("", e);
        }
        result.put("info", "Delete user success");
        return result;
    }

}
