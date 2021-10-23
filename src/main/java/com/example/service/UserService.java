package com.example.service;

import com.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: ming
 * @date: 2021/10/21 17:23
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public boolean checkUsername(String username) {
        Integer id = userDao.findUserByName(username);
        if (id != null) {
            return false;
        }
        return true;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUser(String username, String password) {
        userDao.saveUser(username, password);
    }
}
