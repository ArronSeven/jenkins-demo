package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 * </br>
 * @author:zhanghb
 * @version:1.0
 * @date:2018-10-12 21:50
 *
 *
 *
 */
@RestController
public class HelloController {
    @Autowired
    public HelloService helloService;

    @RequestMapping("/test")
    public String test(){
        helloService.update();
        return "ffff";
    }
}
