package com.example.demo.elibrary.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	@GetMapping(value = {"/","/home", "/elibrary", "elibrary/home"})
	public String displayHomePage() {
		
		return "home/index";
	}
	
	@GetMapping(value = {"/about", "/elibrary/about", "elibrary/home/about"})
	public String displayAboutPage() {
		
		return "home/about";
	}
	
}
