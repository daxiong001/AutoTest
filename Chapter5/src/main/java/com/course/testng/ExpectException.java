package com.course.testng;

import org.testng.annotations.Test;

/*
* 异常测试
* 在我们期望结果为某一个异常时
* 比如我们传入了某些不合法的参数，程序抛出了异常
* 也就是说我的预期结果就是这个异常
* */
public class ExpectException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException1(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }

}
