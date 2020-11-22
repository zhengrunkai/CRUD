package com.zrk.service;

import com.zrk.entity.User;

public interface UserService {

    void register(User user);

    User login(String username,String password);
}
