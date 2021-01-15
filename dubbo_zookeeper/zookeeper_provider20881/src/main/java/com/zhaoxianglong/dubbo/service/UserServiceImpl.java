package com.zhaoxianglong.dubbo.service;

import com.zhaoxianglong.dubbo.entity.User;
import com.zhaoxianglong.dubbo.map.UserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: dubbo
 * @description: user逻辑实现
 * @author: zhaoxianglong
 * @create: 2021-01-15 10:17
 **/
@Service
@Component
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper mapper;

    @Override
    public User getUserById(Integer id) {
        return mapper.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return mapper.getAllUsers();
    }

    @Override
    public Integer addUser(User user) {
        return mapper.addUser(user);
    }

    @Override
    public Integer delUserById(Integer id) {
        return mapper.delUserById(id);
    }

    @Override
    public Integer updateUser(User user) {
        return mapper.updateUser(user);
    }
}
