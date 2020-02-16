package com.intellitech.springlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringlabsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringlabsApplication.class, args);
	}
}
