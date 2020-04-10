package com.ityun.commons.handle;

import com.ityun.response.ResponseNoData;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BindException.class)
    public ResponseNoData handleBindException(BindException e) {
        String message = e.getAllErrors().get(0).getDefaultMessage();
        return ResponseNoData.error(-1, message);
    }
}
