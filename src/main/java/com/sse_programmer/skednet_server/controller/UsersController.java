package com.sse_programmer.skednet_server.controller;

import com.sse_programmer.skednet_server.entity.User;
import com.sse_programmer.skednet_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/users")
    @ResponseBody
    public List<User> getAllUsers() {
        return service.getAll();
    }

    @GetMapping(value = "/users/{id}")
    @ResponseBody
    public User getUser(@PathVariable long id) {
        return service.getByID(id);
    }

    @PostMapping(value = "/users/{id}")
    @ResponseBody
    public User saveUser(@RequestBody User user) {
        return service.save(user);
    }

    @DeleteMapping(value = "/users/{id}")
    @ResponseBody
    public void deleteUser(@PathVariable long id) {
        service.remove(id);
    }

    /*private User createMockUser() {
        User user = new User();
        user.setEmail("admin@gmail.com");
        user.setPassword("admin");
        user.setName("Admin");
        user.setNickname("Admin228");
        user.setSurname("Adminov");
        user.setRegistrationDate(new Date());

        return user;
    }*/
}
