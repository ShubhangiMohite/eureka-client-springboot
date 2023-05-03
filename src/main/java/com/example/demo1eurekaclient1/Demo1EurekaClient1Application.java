package com.example.demo1eurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Demo1EurekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1EurekaClient1Application.class, args);
    }

}
