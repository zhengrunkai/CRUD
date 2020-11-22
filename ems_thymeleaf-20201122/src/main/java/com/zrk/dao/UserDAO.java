package com.zrk.dao;

import com.zrk.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {

    //保存用户
    void save(User user);

    //登录
    User login(@Param("username") String username,@Param("password") String password);
}
