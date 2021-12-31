package com.coforge.training.springweb.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloWorldController {

	@RequestMapping("/gaurav")
	public String showHelloWorld() {
	return "HelloWorld"; //returns view name
	}
}