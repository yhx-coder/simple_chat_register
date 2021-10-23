package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author: ming
 * @date: 2021/10/21 16:54
 */

@Data
@ToString
@Component
public class User {
    private Integer id;
    private String username;
    private String password;
}
