package com.example.controller.advice;

import com.example.exception.BusinessException;
import com.example.exception.ErrorCode;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author: ming
 * @date: 2022/1/17 17:05
 */

@ControllerAdvice
public class ExceptionAdvice implements ErrorCode {

    @ExceptionHandler
    public String handleException(Exception e, Model model) {
        if (e instanceof BusinessException){
            String errorMessage = e.getMessage();
            model.addAttribute("errorMessage",errorMessage);
            return "register";
        }
        return "register";
    }
}
