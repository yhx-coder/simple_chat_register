package com.example.dao;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: ming
 * @date: 2021/10/21 17:13
 */
@Mapper
public interface UserDao {
    Integer findUserByName(String username);

    void saveUser(String username,String password);
}
