package com.offcn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import com.offcn.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
