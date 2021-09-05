package com.pokka.rest.webservice.restfulwebservice.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class BasicAuthenticationController {
	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean(@PathVariable String name) {
//		throw new RuntimeException("Some Error Occured"); 
		return new AuthenticationBean("You are authenticated");
	}

	
	
	
}
