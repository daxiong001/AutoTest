package com.course.testng.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuitConfig {

    @BeforeSuite
    public void berforesuit(){
        System.out.println("berfore suit运行啦");
    }

    @AfterSuite
    public void aftersuit(){
        System.out.println("after suit运行啦");
    }
}
