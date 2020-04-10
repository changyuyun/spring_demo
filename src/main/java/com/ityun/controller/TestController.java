package com.ityun.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@Validated
@RestController
public class TestController {
    @GetMapping("/test")
    public String doTest(@NotBlank(message = "id不能空") String id, @NotBlank(message = "username不能为空") String username) {
        return "test";
    }
}
