package com.offcn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("t_user_base")
public class UserBase {
    @TableId(type = IdType.AUTO)
    private Integer ubid;
    private String usex;
    private Date u_bir;
    private Integer ufk;
    private Integer uage;
}
