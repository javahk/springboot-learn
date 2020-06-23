package com.springboot.learn._2aop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.learn._2aop.ascpect.Log;
import com.springboot.learn.mapper.UserMapper;
import com.springboot.learn.model.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Log
    @Override
    public int addUser(User user) {
        userMapper.addUser(user);
        throw new RuntimeException("123");
    }

    @Override
    public int deleteUser(User user) {
        return userMapper.deleteUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User getUserById(User user) {
        return userMapper.getUserById(user);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.selectAllUser();
    }
}
