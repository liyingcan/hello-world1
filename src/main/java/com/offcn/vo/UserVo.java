package com.offcn.vo;

import com.offcn.entity.User;
import com.offcn.entity.UserBase;
import lombok.Data;

@Data
public class UserVo {
    private User user;
    private UserBase userBase;
}
