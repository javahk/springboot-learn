package com.springboot.learn._2aop.service;

import com.springboot.learn._2aop.ascpect.Log;
import com.springboot.learn.model.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    int deleteUser(User user);

    int updateUser(User user);

    User getUserById(User user);

    List<User> findAllUser();
}
