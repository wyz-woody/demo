package com.wyz.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.wyz.example.demo"})
public class OAuth2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2DemoApplication.class, args);
    }

}
