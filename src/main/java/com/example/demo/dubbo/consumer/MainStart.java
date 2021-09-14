package com.example.demo.dubbo.consumer;

import com.example.demo.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStart {
    private static final String configLocation = "config/appcontext-dubbo-consumer.xml";
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

//        IUserService bean = context.getBean(IUserService.class);
        IUserService bean = (IUserService) context.getBean("iUserService");

        String hello_world = bean.getUserName("hello world");

        System.out.println("hello_world  ---- " + hello_world);

    }
}


