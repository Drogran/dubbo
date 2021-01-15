package com.zhaoxianglong.dubbo.map;

import com.zhaoxianglong.dubbo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @program: dubbo
 * @description: user数据库接口
 * @author: zhaoxianglong
 * @create: 2021-01-15 10:19
 **/
@Mapper
public interface UserMapper {

    /**
     * 根据id查找
     * @param id 主键
     * @return User.class
     */
    @Select("select * from User where id = #{id}")
    User getUserById(@Param("id") Integer id);

    /**
     * 查找所有
     * @return user.class
     */
    @Select("select * from User")
    List<User> getAllUsers();

    /**
     * 新增
     * @param user 实体类
     * @return yes or no
     */
    @Insert("insert into user values(#{u.id} , #{u.name} , #{u.age})")
    Integer addUser(@Param("u") User user);

    /**
     * 根据主键删除
     * @param id 主键
     * @return yes or no
     */
    @Delete("delete user where id = #{id}")
    Integer delUserById(@Param("id") Integer id);

    /**
     * 更改user
     * @param user 实体类
     * @return yes or no
     */
    @Update("update user set name = #{u.name} , age =#{u.age} where id = #{u.id}")
    Integer updateUser(@Param("u") User user);
}
