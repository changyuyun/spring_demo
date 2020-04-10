package com.ityun.controller;

import com.ityun.domain.Factory;
import com.ityun.response.Response;
import com.ityun.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * mybatis简单使用示例
 */
@RestController
public class MybatisController {
    @Autowired
    private FactoryService factoryService;

    @RequestMapping(value = "mybatis")
    public Response mybatis() {
        int i = factoryService.insertFactory("ityun", 18, "it");
        System.out.println(i);
        List<Factory> factories = factoryService.allFactory();
        Response response = new Response();
        response.setCode(1);
        response.setMessage("ok");
        response.setData(factories);
        return response;
    }
}
