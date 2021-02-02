package com.example.network;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path = "/greeting")
	public String greeting() {
		return "Hellow world";

	}

}
