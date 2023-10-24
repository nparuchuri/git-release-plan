package com.nparuchuri.gitrelease;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
	
	
	@GetMapping("/")
	public String index() {
		
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/dev")
	public String developmentBranch() {
		
		return "This version is dev branch";
		
	}

}
