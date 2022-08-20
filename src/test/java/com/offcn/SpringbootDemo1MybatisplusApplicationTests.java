package com.offcn;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.offcn.controller.UserController;
import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import com.offcn.entity.UserBase;
import com.offcn.service.UserBaseService;
import com.offcn.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootDemo1MybatisplusApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Autowired
    private UserBaseService userBaseService;

    @Autowired
    private UserController userController;

    //测试主键修改
    @Test
    void contextLoads() {
        //Integer integer = userDao.selectCount(null);
        //System.out.println(integer);

        User user = new User(11,"吕奉先","333");
        int i = userDao.updateById(user);
        System.out.println(i);
    }

    //条件修改
    @Test
    public void testWrapper(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("uid",12,19);

        User user = new User();
        user.setUpwd("444");

        int i = userDao.update(user, wrapper);
        System.out.println(i);
    }

    ///////////////////////////////////////////////////////////////
    //测试业务层功能
    @Test
    public void testSave(){
        User user = new User();
        user.setUname("鲁智深");
        user.setUpwd("7777");

        userService.save(user);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setUid(21);
        user.setUname("花和尚");
        user.setUpwd("8888");

        boolean b = userService.updateById(user);
        System.out.println(b);
    }

    //删除测试
    @Test
    public void testDelete(){
        boolean b = userService.removeById(21);
        System.out.println(b);
    }

    //查询操作 -- id
    @Test
    public void testId(){
        User user = userService.getById(20);
        System.out.println(user);
    }

    //条件查询
    @Test
    public void testWrapper2(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("uid",10,20);

        List<User> list = userService.list(wrapper);
        System.out.println(list);
    }

    //测试base表单一查询
    @Test
    public void testBaseId(){
        UserBase userBase = userBaseService.getById(1);
        System.out.println(userBase);
    }

    @Test
    public void testController(){
        userController.first();
    }
}
