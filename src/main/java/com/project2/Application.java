package com.project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello My Friend";
	}
	@GetMapping("/sayBye")
	public String sayBye() {
		return "Goodbye my friend";
	}
}
