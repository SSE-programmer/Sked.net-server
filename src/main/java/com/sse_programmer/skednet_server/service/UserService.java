package com.sse_programmer.skednet_server.service;

import com.sse_programmer.skednet_server.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getByID(long id);
    User save(User user);
    void remove(long id);
}
