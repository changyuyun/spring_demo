package com.ityun.commons.handle;

import com.ityun.response.ResponseNoData;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

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

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseNoData handleConstraintViolationException(ConstraintViolationException e) {
        String message = e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(","));
        return ResponseNoData.error(-1, message);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseNoData handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        return ResponseNoData.error(-1, message);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseNoData handelHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        String message = e.getMessage();
        return ResponseNoData.error(-1, message);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseNoData handelMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        String message = e.getMessage();
        return ResponseNoData.error(-1, message);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseNoData handelHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        String message = e.getMessage();
        return ResponseNoData.error(-1, message);
    }
}
