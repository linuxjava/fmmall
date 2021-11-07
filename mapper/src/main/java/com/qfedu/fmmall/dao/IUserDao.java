package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.entity.User;

import java.util.List;

public interface IUserDao {
    List<User> queryUserByName(String name);
}
