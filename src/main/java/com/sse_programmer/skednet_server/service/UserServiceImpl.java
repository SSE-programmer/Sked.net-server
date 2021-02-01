package com.sse_programmer.skednet_server.service;

import com.sse_programmer.skednet_server.entity.User;
import com.sse_programmer.skednet_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getByID(long id) {
        return repository.findById(id).orElse(new User());
    }

    @Override
    public User save(User user) {
        return repository.saveAndFlush(user);
    }

    @Override
    public void remove(long id) {
        repository.deleteById(id);
    }
}
