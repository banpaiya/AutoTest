package com.testng.auto;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite这是测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite这是测试套件");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest这是测试前执行");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest这是测试后执行");
    }
}
