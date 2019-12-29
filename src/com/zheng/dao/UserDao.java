package com.zheng.dao;

public interface UserDao {
    //减钱
    void decrease(Integer from, Double money);
    ///加钱
    void increase(Integer to, Double money);
}
