package com.example.service;

import com.example.dao.UserDao;
import com.example.exception.BusinessException;
import com.example.exception.ErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;




/**
 * @author: ming
 * @date: 2021/10/21 17:23
 */
@Service
public class UserService implements ErrorCode {
    @Autowired
    private UserDao userDao;

    public boolean checkUsername(String username) {
        if (StringUtils.isEmpty(username)){
            throw new BusinessException(CLIENT_CODE,"用户名不能为空！");
        }
        Integer id = userDao.findUserByName(username);

        return id == null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUser(String username, String password) {
        if (StringUtils.isEmpty(username) ||StringUtils.isEmpty(password)){
            throw new BusinessException(CLIENT_CODE,"用户名或密码不能为空！");
        }
        userDao.saveUser(username, password);
    }
}
