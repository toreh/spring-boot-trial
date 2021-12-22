package com.example.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// will fail if controller is in different package than hello application!!
@RestController
public class HelloWorldController {
    
	@Value("${hello.message.property}")
    private String propertyMessage;
	
	@RequestMapping("/")
	public String hello() {
		System.out.println("HelloWorldController -Running hello:" + propertyMessage);
		return propertyMessage;
	}
}