package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.service.IUserService;
import com.qfedu.fmmall.service.impl.UserService;
import com.qfedu.fmmall.vo.ResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/queryuser")
    public ResultVo queryUser(@RequestParam("name") String name){
        System.out.println("name=" + name);

        return userService.queryUserByName(name);
    }
}
