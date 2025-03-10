package com.wipro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Docker")
public class DockerContoller {
	
	@GetMapping
	public String getData()
	{
		return "Hello, Docker";
	}
}
