package com.example.controller;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: ming
 * @date: 2021/10/21 17:32
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/register")
    public String register(@RequestParam(value = "username") String username,
                           @RequestParam(value = "password") String password, Model model) {
        if (userService.checkUsername(username)) {
            userService.saveUser(username, password);
            model.addAttribute("status", "success");
        } else {
            model.addAttribute("status", "fail");
        }
        return "result";
    }
}
