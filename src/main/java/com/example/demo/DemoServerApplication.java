package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
@ImportResource("classpath:config/appcontext-*.xml")
@SpringBootApplication
public class DemoServerApplication {

	public static void main(String[] args) {
		System.err.println("服务端启动--------------------------------------ok");
		SpringApplication.run(DemoServerApplication.class, args);
	}
}
