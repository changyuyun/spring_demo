package com.ityun.service.impl;

import com.ityun.domain.Factory;
import com.ityun.mapper.FactoryMapper;
import com.ityun.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FactoryServiceImpl implements FactoryService {
    @Autowired
    private FactoryMapper factoryMapper;
    @Override
    public int insertFactory(String name, int age, String work) {
        return factoryMapper.insert(name, age, work);
    }

    @Override
    public List<Factory> allFactory() {
        return factoryMapper.all();
    }

    @Override
    public Factory oneFactory(int id) {
        return factoryMapper.findById(id);
    }

    @Override
    public int deleteFactory(int id) {
        return factoryMapper.deleteById(id);
    }

    @Override
    public int updateById(int id, String name, int age) {
        return factoryMapper.updateById(id, name, age);
    }
}
