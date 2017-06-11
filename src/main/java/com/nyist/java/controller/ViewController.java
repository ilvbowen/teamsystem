package com.nyist.java.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lvbowen on 2017/6/12.
 * we will be the best
 */
public class ViewController {

    @GetMapping
    public String index(){
        return "ss";
    }

}
