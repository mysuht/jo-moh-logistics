package com.suht.log.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")	
	public	String	welcome(Model	model)	{	
			model.addAttribute("greeting",	"Welcome	to	Logistics Management Info System");	
			model.addAttribute("tagline",	"The	one	and	only LMIS");
			return "welcome";
	}
}
