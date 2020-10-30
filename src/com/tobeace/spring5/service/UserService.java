package com.tobeace.spring5.service;

import com.tobeace.spring5.dao.UserDao;

public class UserService {

    // 创建UserDao类型的属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("User Service ");
        userDao.update();
        //原始方式
        //UserDao userDao=new UserDao();

    }
}
