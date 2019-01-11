package com.example.demo;

import org.springframework.stereotype.Service;

/***
 *
 * </br>
 * @author:zhanghb
 * @version:1.0
 * @date:2018-10-12 21:02
 *
 *
 *
 */
@Service
public class HelloIml implements HelloService {

    @Override
    public void update(){
        System.out.println("更新");
        try {

            int i = 1 / 0;
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
