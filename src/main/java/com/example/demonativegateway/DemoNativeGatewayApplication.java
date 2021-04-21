package com.example.demonativegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;

@SpringBootApplication(proxyBeanMethods = false, exclude = ValidationAutoConfiguration.class)
public class DemoNativeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoNativeGatewayApplication.class, args);
    }

}
