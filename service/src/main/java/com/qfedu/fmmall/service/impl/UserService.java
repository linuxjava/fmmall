package com.qfedu.fmmall.service.impl;

import com.qfedu.fmmall.dao.IUserDao;
import com.qfedu.fmmall.entity.User;
import com.qfedu.fmmall.service.IUserService;
import com.qfedu.fmmall.vo.ResultVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public ResultVo queryUserByName(String name) {
        List<User> users = userDao.queryUserByName(name);
        return new ResultVo(1, "test", users);
    }
}
