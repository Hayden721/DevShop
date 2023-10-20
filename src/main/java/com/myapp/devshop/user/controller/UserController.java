package com.myapp.devshop.user.controller;

import com.myapp.devshop.user.service.face.UserService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class UserController {

final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/user/test")
    public void test(Model model) {
        log.info("test");
        String data = userService.dataSelect();
        model.addAttribute("data", data);

    }

}
