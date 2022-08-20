package com.offcn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("t_user")
public class User implements Serializable {

    @TableId(type = IdType.AUTO)//标识当前是主键对应的主属性
    private Integer uid;
    private String uname;
    private String upwd;
}
