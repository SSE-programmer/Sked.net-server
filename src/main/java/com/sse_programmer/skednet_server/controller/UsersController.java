package com.sse_programmer.skednet_server.controller;

import com.sse_programmer.skednet_server.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping(value = "/get")
    @ResponseBody
    public User getUsers() {
        return createMockUser();
    }

    private User createMockUser() {
        User user = new User();
        user.setEmail("admin@gmail.com");
        user.setPassword("admin");
        user.setName("Admin");
        user.setNickname("Admin228");
        user.setSurname("Adminov");
        user.setRegistrationDate(new Date());

        return user;
    }
}
