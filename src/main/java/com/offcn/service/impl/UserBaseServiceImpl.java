package com.offcn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.offcn.dao.UserBaseDao;
import com.offcn.entity.UserBase;
import com.offcn.service.UserBaseService;
import org.springframework.stereotype.Service;

@Service
public class UserBaseServiceImpl extends ServiceImpl<UserBaseDao, UserBase> implements UserBaseService {
}
