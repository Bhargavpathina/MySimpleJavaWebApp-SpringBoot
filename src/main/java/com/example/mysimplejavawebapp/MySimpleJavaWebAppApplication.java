package com.example.mysimplejavawebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
public class MySimpleJavaWebAppApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MySimpleJavaWebAppApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MySimpleJavaWebAppApplication.class);
    }
}
@RestController
        public class HelloWorldController {

            @GetMapping("/")
            public String hello() {
                return "Hello from Azure DevOps Java App from GitHub!";
            }
        }
        
