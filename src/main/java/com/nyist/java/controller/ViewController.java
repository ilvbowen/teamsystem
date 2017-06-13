package com.nyist.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lvbowen on 2017/6/12.
 * we will be the best
 */
@Controller
public class ViewController {

    @GetMapping("index")
    public String index(){
        return "ss";
    }



}
