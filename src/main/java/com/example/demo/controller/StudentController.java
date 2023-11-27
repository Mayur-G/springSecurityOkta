package com.example.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/logout
//http://localhost:8080/home

@RestController
public class StudentController {

	@GetMapping("/home")
	public String getPrincipal(Principal principal)
	{
		return principal.getName() +" connected "+principal;		
	}
}
