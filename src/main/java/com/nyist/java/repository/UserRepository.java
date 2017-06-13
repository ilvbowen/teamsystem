package com.nyist.java.repository;

import com.nyist.java.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by zhoukaili on 2017/6/13.
 */
public interface UserRepository  extends PagingAndSortingRepository<User,Integer>{
    User findByUserName(String userName);
    User findByUserNameAndPassword(String userName,String password);

}
