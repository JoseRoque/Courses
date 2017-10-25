package com.josejroque.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	// controller contains (usually http) request mapping
	// by default maps to all http methods
	@RequestMapping("/hello")
	public String hello() {
		return "Hi";
	}
}
