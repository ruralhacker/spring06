package com.zheng.service.impl;

import com.zheng.dao.UserDao;
import com.zheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void transfer(Integer from,Integer to,Double money) {
        userDao.decrease(from,money);
//        int i=1/0;
        userDao.increase(to,money);

    }
}
