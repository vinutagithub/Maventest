package com.mavenprj.demo;


import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestExample1 {

    @Test
    public void Test1(){
        System.out.println("class2 testcase1");
        Assert.assertEquals(10,10);
    }
    @Test
    public void Test2(){
        System.out.println("class2 testcase2");
        assertTrue(true);

    }
}
