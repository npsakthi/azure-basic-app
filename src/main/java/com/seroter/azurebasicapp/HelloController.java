package com.seroter.azurebasicapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController {
 
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World RESTful with Spring Boot";
    }
    
    @RequestMapping("/myhello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
        return "Hello " + name;
    }

}