package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

/**
 * @author: ming
 * @date: 2021/10/21 16:54
 */

@Data
@ToString
@Component
public class User {

    private Integer id;

    @NotBlank(message = "用户名不能为空！")
    private String username;

    @NotBlank(message = "密码不能为空！")
    private String password;
}
