package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.service.IUserService;
import com.qfedu.fmmall.vo.ResultVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    @ApiOperation("用户查询")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "name", required = true, value = "用户名")
    })
    @GetMapping("/queryuser")
    public ResultVo queryUser(@RequestParam("name") String name) {
        System.out.println("name=" + name);
        return userService.queryUserByName(name);
    }
}
