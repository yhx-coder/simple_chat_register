package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.dao")
@SpringBootApplication
public class SmallChatRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallChatRegisterApplication.class, args);
    }

}
