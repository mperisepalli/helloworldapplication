package com.whishworks;


import org.junit.Test;

public class HelloTest {
    @Test
    public void testHello() throws Exception{

        Hello hello=new Hello();
        hello.sayHello("en");
    }
}
