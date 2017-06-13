package com.nyist.java.service;

import com.nyist.java.entity.User;

/**
 * Created by zhoukaili on 2017/6/13.
 */
public interface UserService {


    User findone(String userName);
    User login(String userName,String password);


}
