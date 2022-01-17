package com.example.exception;

/**
 * @author: ming
 * @date: 2022/1/17 16:11
 */
public class BusinessException extends RuntimeException{
    private int code;
    private String message;

    public BusinessException(int code,String message){
        super();
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
