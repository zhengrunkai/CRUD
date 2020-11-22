package com.zrk.service;

import com.zrk.dao.UserDAO;
import com.zrk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public void register(User user) {
//        user.setId(Integer.parseInt(UUID.randomUUID().toString()));
        userDAO.save(user);
    }

    @Override
    public User login(String username, String password) {
        return userDAO.login(username,password);
    }

}
