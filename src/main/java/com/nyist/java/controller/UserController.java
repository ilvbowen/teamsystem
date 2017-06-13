package com.nyist.java.controller;

import com.nyist.java.Basic.Status;
import com.nyist.java.TO.ReturnMessage;
import com.nyist.java.entity.User;
import com.nyist.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvbowen on 2017/6/13.
 * we will be the best
 */
@RestController("/user")
public class UserController {

    @Autowired
    UserService userService;

    Status status;

    @PostMapping("sign/in")
    public ReturnMessage SignIn(User user){

        User user1 = userService.login(user.getUserName(),user.getPassword());
        List list = new ArrayList();
        list.add(user1);
        if (user1 == null){
            status = Status.ERROR;
        }else {
            status = Status.OK;
        }
       return new ReturnMessage(status,list.size(),list);
    }


}
