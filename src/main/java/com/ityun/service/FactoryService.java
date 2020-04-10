package com.ityun.service;

import com.ityun.domain.Factory;

import java.util.List;

public interface FactoryService {
    int insertFactory(String name, int age, String work);

    List<Factory> allFactory();

    Factory oneFactory(int id);

    int deleteFactory(int id);

    int updateById(int id,String name, int age);
}
