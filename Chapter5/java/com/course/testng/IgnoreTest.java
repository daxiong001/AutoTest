package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore(){
        System.out.println("ignore1 执行");
    }

    @Test(enabled = false) //忽略测试
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void igonre3(){
        System.out.println("ignore3 执行");
    }
}
