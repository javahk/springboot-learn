package com.springboot.learn._2aop.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springboot.learn._2aop.ascpect.Log;
import com.springboot.learn.mapper.UserMapper;
import com.springboot.learn.model.User;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

//    @Log
    @Transactional
    @Override
    public int addUser(User user) {
        userMapper.addUser(user);

        // 模拟aop事务回滚
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
