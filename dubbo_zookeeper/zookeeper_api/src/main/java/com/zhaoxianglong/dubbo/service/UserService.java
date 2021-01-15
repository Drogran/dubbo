package com.zhaoxianglong.dubbo.service;

import com.zhaoxianglong.dubbo.entity.User;

import java.util.List;

/**
 * @program: dubbo
 * @description: user接口
 * @author: zhaoxianglong
 * @create: 2021-01-15 10:13
 **/
public interface UserService{

    User getUserById(Integer id);

    List<User> getAllUsers();

    Integer addUser(User user);

    Integer delUserById(Integer id);

    Integer updateUser(User user);
}
