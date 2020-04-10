package com.ityun.service.impl;

import com.ityun.dao.impl.UserDaoImpl;
import com.ityun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDaoImpl userDao;

    @Override
    public List getAll() {
       /* String sql = "select * from tab_user where uid=1";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return list;*/
       return userDao.getAll();
    }
}
