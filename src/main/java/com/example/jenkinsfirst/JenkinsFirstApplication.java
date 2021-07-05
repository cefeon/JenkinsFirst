package com.example.jenkinsfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsFirstApplication.class, args);
    }

    @GetMapping
    public String get(){
        return "Hello World";
    }

}
