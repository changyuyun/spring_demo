package com.ityun.commons.handle;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 方法参数校验
     */
    /*@ExceptionHandler(MethodArgumentNotValidException.class)
    public ReturnVO handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return new ReturnVO().error(e.getBindingResult().getFieldError().getDefaultMessage());
    }*/
}
