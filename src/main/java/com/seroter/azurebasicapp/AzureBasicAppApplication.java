package com.seroter.azurebasicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureBasicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureBasicAppApplication.class, args);
	}
	
	@Value("${company:Not configured by a Spring Cloud Server}")
    private String company;
     
    @GetMapping("/hello")
    public String Hello() {
      return "hello, from " + company;
    }

}
