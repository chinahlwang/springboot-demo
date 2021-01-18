package com.google.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author hlwang
 * @Date 2021/1/12
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "ok";
    }
}
