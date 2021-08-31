package com.pokka.rest.webservice.restfulwebservice.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin
@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello/{name}")
	public HelloWorldBean helloBean(@PathVariable String name) {
//		throw new RuntimeException("Some Error Occured"); 
		return new HelloWorldBean(String.format("hi There %s", name));
	}

	
	
	
}
