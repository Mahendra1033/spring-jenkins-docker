package com.springjenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsDockerApplication {

	@GetMapping("/")
	public String home() {
		return " Docker With Jenkins Working Fine :) !!! (:";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDockerApplication.class, args);
	}

}
