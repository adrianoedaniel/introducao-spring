package com.projetoaula;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClasseController {

	@GetMapping ("/")
	public String index() {
		return "index";
	}
	
	@GetMapping ("/menu")
	public String menu() {
		return "menu";
		
		
	}
	@GetMapping ("/sobre")
	public String sobre() {
		return "sobre";
		
		
	}
}
