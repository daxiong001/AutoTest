package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端足的测试方法1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端足的测试方法2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法4");
    }

    @BeforeGroups("server")
    public void berforeGroupOnServer(){
        System.out.println("这是服务端组运行前的方法");
    }

    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("这是服务端组运行后的方法！！！！");
    }

    @BeforeGroups("client")
    public void berforeGroupOnclient(){
        System.out.println("这是客户端组运行前的方法");
    }

    @AfterGroups("client")
    public void afterGroupOnclient(){
        System.out.println("这是客户端组运行后的方法！！！！");
    }
}
