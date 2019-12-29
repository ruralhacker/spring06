package com.zheng.dao.impl;

import com.zheng.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void decrease(Integer id, Double money) {
        jdbcTemplate.update("update user1 set money=money-? where id=?",money,id);

    }

    @Override
    public void increase(Integer id, Double money) {
        jdbcTemplate.update("update user1 set money=money+? where id=?",money,id);

    }
}
