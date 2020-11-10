package com.zwz521.controller;

import com.zwz521.pojo.User;
import com.zwz521.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 赵文卓
 * @version 1.0
 * @date 2020/11/3 11:24
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser/{id}")
    public String findById(@PathVariable("id") int id, Model model){
        User user = userService.findById(id);
        model.addAttribute("user",user);
        return "userList";
    }
}
