package com.onlineshop.service;

import com.onlineshop.dao.UserDao;
import com.onlineshop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User login(String username, String password) {
        User user = userDao.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public boolean register(User user) {
        if (userDao.findByUsername(user.getUsername()) != null) {
            return false; // Username already exists
        }
        // In a real application, password should be hashed here.
        user.setRole("USER");
        userDao.save(user);
        return true;
    }
}
