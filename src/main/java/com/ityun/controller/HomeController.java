package com.ityun.controller;

import com.ityun.domain.User;
import com.ityun.response.Response;
import com.ityun.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 测试mysql数据库操作。参数校验
 */
@RestController
public class HomeController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping(value = "/")
    public Response index(@Valid @RequestBody User user) {
        List list = userService.getAll();
        Response response = new Response();
        response.setCode(1);
        response.setMessage("ok");
        response.setData(list);
        return response;
    }
}
