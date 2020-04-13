package com.ityun.controller;

import com.ityun.utils.HttpUtils;
import com.ityun.utils.SignUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotBlank;
import java.util.Map;
import java.util.SortedMap;

@Validated
@RestController
public class TestController {
    @GetMapping("/test")
    public String doTest(@NotBlank(message = "id不能空") String id, @NotBlank(message = "username不能为空") String username) {
        return "test get";
    }

    @PostMapping("/test2")
    public String doTest2(@RequestBody(required = false) @NotBlank(message = "id不能空") String id, @NotBlank(message = "username不能为空") String username) {
        return "test post";
    }
    @RequestMapping("/testSign")
    public String testSign(HttpServletRequest request, Map<String,String> params) {
        Map<String, String> allParams = HttpUtils.getAllParams(request, params);
        boolean b = SignUtils.verifySign(allParams);
        System.out.println(b);
        return "";
    }
}
