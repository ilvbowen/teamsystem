package com.nyist.java.service;

import com.nyist.java.entity.News;

/**
 * Created by zhoukaili on 2017/6/13.
 */
public interface NewService {
    News findOne(String Id);
}
