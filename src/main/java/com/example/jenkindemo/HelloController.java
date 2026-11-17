package com.example.jenkindemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String home() {
		return "welcome";
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	@GetMapping("/status")
	public String status() {
		return "running";
	}
	
}
