package com.example.demo.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStart {

    private static final String configLocation = "config/appcontext-dubbo-provider.xml";
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        context.start();
        System.in.read();
    }
}
