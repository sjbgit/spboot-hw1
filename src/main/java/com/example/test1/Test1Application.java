package com.example.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test1Application {

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!!!!!!";
	}

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello, World! - my second endpoint";
	}
}
