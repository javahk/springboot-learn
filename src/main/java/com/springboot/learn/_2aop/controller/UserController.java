package com.springboot.learn._2aop.controller;

import com.springboot.learn.model.User;
import com.springboot.learn._2aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    /*Get方式方便web测试*/

    /*增加用户*/
    // http://localhost:8080/user/addUser/?userName=Alex&userAge=20
    @GetMapping(value = "/addUser")
    public int addUser(User user) {
        return userService.addUser(user);
    }

    /*删除用户*/
    // http://localhost:8080/user/deleteUser/?userId=2
    @GetMapping(value = "/deleteUser")
    public int deleteUser(User user) {
        return userService.deleteUser(user);
    }

    /*修改用户*/
    // http://localhost:8080/user/updateUser/?userId=3&userName=刘牧师&userAge=50
    @GetMapping(value = "/updateUser")
    public int updateUser(User user) {
        return userService.updateUser(user);
    }

    /*根据UserId查找用户*/
    // http://localhost:8080/user/getUserById/?userId=3
    @GetMapping(value = "/getUserById")
    public User getUserById(User user) {
        return userService.getUserById(user);
    }

    /*查询所有用户*/
    // http://localhost:8080/user/getAllUsers
    @GetMapping(value = "/getAllUsers")
    public Object findAllUser() {
        return userService.findAllUser();
    }





    /* Post  请求*/

//    /*增加用户*/
//    // http://localhost:8080/user/addUser/?userName=Alex&userAge=20
//    @PostMapping(value = "/addUser")
//    public int addUser(@RequestBody  User user){
//        return userService.addUser(user);
//    }
//
//    /*删除用户*/
//    // http://localhost:8080/user/deleteUser/?userId=2
//    @PostMapping(value = "/deleteUser")
//    public  int deleteUser(@RequestBody User user){
//        return userService.deleteUser(user);
//    }
//
//    /*修改用户*/
//    // http://localhost:8080/user/updateUser/?userId=3&userName=刘牧师&userAge=50
//    @PostMapping(value = "/updateUser")
//    public  int  updateUser(@RequestBody User user){
//        return userService.updateUser(user);
//    }
//
//    /*根据UserId查找用户*/
//    // http://localhost:8080/user/getUserById/?userId=3
//    @PostMapping(value = "/getUserById")
//    public User getUserById(@RequestBody User user){
//        return userService.getUserById(user);
//    }
//
//    /*查询所有用户*/
//    // http://localhost:8080/user/getAllUsers
//    @PostMapping(value = "/getAllUsers")
//    public Object findAllUser(){
//        return userService.findAllUser();
//    }
}
