package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanHeng
 * @date 2020-06-29 16:12
 * @description 初始化控制层
 */
@RestController
@RequestMapping("/test")
public class SpringBootInitController {

    public static final String PATH = "/prpLRegistExt";


    @RequestMapping(value = "/get",method = {RequestMethod.GET})
    public void commonReturn(String name){
        System.out.println("2333"+name);


    }
}
