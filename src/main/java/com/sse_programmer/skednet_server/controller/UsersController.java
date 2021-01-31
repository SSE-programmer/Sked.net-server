package com.sse_programmer.skednet_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UsersController {

    @GetMapping(value = "/get")
    public @ResponseBody String getUsers(ModelMap model) {
        return "Users";
    }
}
