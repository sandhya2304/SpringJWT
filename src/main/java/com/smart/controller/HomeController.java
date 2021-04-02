package com.smart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	
	@RequestMapping(value="/hello")
	public String hello()
	{
		String text = "Welcome";
		return "hello sandy"+text;
	}
	

}
