package com.engine.restful.service;

import java.util.List;

import com.engine.restful.models.User;

public interface UserService {
    public void createUser(User user);

    public List<User> getUser();

    public User findById(int id);

    public User update(User user, int id);

    public void deleteUserById(int id);

    public User updatePartially(User user, int id);
}