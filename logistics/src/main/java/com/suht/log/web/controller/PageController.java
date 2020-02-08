package com.suht.log.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("greeting", "welcome to logistics online system");
	return mv;
	}
	
	
	@RequestMapping(value= {"/test1"})
	public ModelAndView test1(@RequestParam(value="greeting", required = false) String greeting) {
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("greeting", greeting);
	return mv;
	}
	
	@RequestMapping(value= {"/test2/{greeting}"})
	public ModelAndView test2(@PathVariable(required = false, value="greeting") String greeting) {
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("greeting", greeting);
	return mv;
	}
}
