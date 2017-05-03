package com.ch.controller;

import com.ch.domain.User;
import com.ch.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenhao on 2017/4/25.
 */
@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = { "/welcome.html" },method = RequestMethod.GET)
    public String welcome(Model model){

        User user=new User();
       // user.setUsername("1");
       // List<User> userList=userService.getAll(user);
        List<User> userList1=userService.getAllByXml(user);
        PageInfo pageInfo=new PageInfo<User>(userList1);
        return "welcome";
    }

    @RequestMapping(value = { "/login.html" },method = RequestMethod.GET)
    public String login(){
        return "login";
    }

}
