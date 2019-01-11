package com.example.demo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/***
 *
 * </br>
 * @author:zhanghb
 * @version:1.0
 * @date:2018-10-12 21:54
 *
 *
 *
 */
@Component
@Aspect
public class TestAop {

    @Pointcut("execution (* com.example.demo.HelloIml.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(){
        System.out.println("before........");
    }
    /*@Around("pointcut()")
    public void Around(){
        System.out.println("Around........");
    }*/
    @After("pointcut()")
    public void after(){
        System.out.println("After........");
    }
    @AfterReturning("pointcut()")
    public void AfterReturning(){
        System.out.println("AfterReturning........");
    }
}
