package com.boleg.spring.mvc_hibernate.service;

import com.boleg.spring.mvc_hibernate.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
