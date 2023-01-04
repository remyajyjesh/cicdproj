package com.example.cicdproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdprojRestController {

	@GetMapping("/hello")
	public String printHello() {
		return "Hello";
	}

}
