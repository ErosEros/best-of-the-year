package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nome")
public class MainController {

	@GetMapping()
//	@ResponseBody  non serve visto che usiamo il file index per visualizzare.
	public String home(Model model) { 
		
		model.addAttribute("name" , "Eros");
		return "index";
	}
}
