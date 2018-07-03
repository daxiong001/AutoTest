package com.course.testng;



import org.testng.annotations.*;

public class BasicAnnotation {

    @Test  //标注为测试的一部分
    public void testcase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void berfor(){
        System.out.println("beforeMethod这是测试用例2,方法1之前");
    }

    @AfterMethod
    public void after(){
        System.out.println("afterMethod这是测试用例3，方法1之后");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("berforeClass这是在测试类前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在测试类后运行");
    }

    @BeforeSuite
    public void berforeSuit(){
        System.out.println("berforeSuit测试套件");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit测试套件");
    }
}
