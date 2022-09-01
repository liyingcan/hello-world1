package com.offcn.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.offcn.entity.User;
import com.offcn.entity.UserBase;
import com.offcn.service.UserBaseService;
import com.offcn.service.UserService;
import com.offcn.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserBaseService userBaseService;

    public void first(){
        User user = userService.getById(1);

        QueryWrapper<UserBase> wrapper = new QueryWrapper<>();
        wrapper.eq("ufk",1);
        UserBase userbase = userBaseService.getOne(wrapper);

        UserVo userVo = new UserVo();
        userVo.setUser(user);
        userVo.setUserBase(userbase);

        System.out.println(userVo.getUser());
        System.out.println(userVo.getUserBase());
    }
}
