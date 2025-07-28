package com.ecommerce.shopping_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ShoppingAppApplication {

	public static void main(String[] args) {
		System.out.println("Starting Spring Boot Application...");
		SpringApplication.run(ShoppingAppApplication.class, args);
	}
}

@RestController
class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello Spring Boot!";
	}
}
