package com.zhaoxianglong.dubbo;

import com.zhaoxianglong.dubbo.entity.User;
import com.zhaoxianglong.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: dubbo
 * @description: user 控制台
 * @author: zhaoxianglong
 * @create: 2021-01-15 10:49
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService service;

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Integer id){
        return service.getUserById(id);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping("/addUser")
    public Integer addUser(User user){
        return service.addUser(user);
    }

    @DeleteMapping("/delUserById/{id}")
    public Integer delUserById(@PathVariable Integer id){
        return service.delUserById(id);
    }

    @PostMapping("/updateUser")
    public Integer updateUser(User user){
        return service.updateUser(user);
    }
}
