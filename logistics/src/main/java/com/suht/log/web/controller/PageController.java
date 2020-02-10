package com.suht.log.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.suht.log.web.bean.Report;
import com.suht.logistics_backend.dao.FacilityGroupDAO;
import com.suht.logistics_backend.dao.FacilityTypeDAO;

@Controller
public class PageController {
	@Autowired
	FacilityGroupDAO facilityGroupDAO;
	
	@Autowired
	FacilityTypeDAO facilityTypeAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home Screen");
		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "about Screen");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = { "/{report}/report" })
	public ModelAndView getNonReportingFacility(@PathVariable(value = "report") String reportId,
			@RequestParam(value = "category", required = false) String category) {
		ModelAndView mv = new ModelAndView("page");
		
		Report report = new Report();
		report.setCategory("0");
		mv.addObject("report", report);
		mv.addObject("groupOrTypeLable", "ALL");
		mv.addObject("title", "about Screen");
		mv.addObject("userClickReport", true);
		mv.addObject("reportId", reportId);
		
		Map<String, String> categories = new HashMap<String, String>();
		categories.put("0", "ALL FACILITIES");
		categories.put("1", " GROUP FACILITIES ");
		categories.put("2", " TYPE FACILITIES ");
		//categories.keySet().
		mv.addObject("categories", categories);
		//if(category == null)
		//mv.addObject("selectedCategory", "0");
		
		if (category != null) {
			if (category.equals("1")) {
				mv.addObject("groupOrTypeLable", "GROUP");
				mv.addObject("facilityGroupList", facilityGroupDAO.list());
			}
			if (category.equals("2")) {
				mv.addObject("groupOrTypeLable", "TYPE");
				mv.addObject("facilityGroupList", facilityTypeAO.list());
			}
		}

		if (reportId.equals("1")) {
			mv.addObject("monthlyReport", true);
		} else {
			mv.addObject("periodReport", true);
		}
		return mv;
	}
	
//	@ModelAttribute("categories")
//	public void categoryMap() {
//		
//	}
	
	@RequestMapping(value = { "/{report}/report" }, method=RequestMethod.POST)
	public void x() {
		System.out.println("SUHT XXXXXXXXXXXXXXXXXXXXXXXX");
	}

	/*
	 * @RequestMapping(value= {"/test1"}) public ModelAndView
	 * test1(@RequestParam(value="greeting", required = false) String greeting) {
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("greeting",
	 * greeting); return mv; }
	 * 
	 * @RequestMapping(value= {"/test2/{greeting}"}) public ModelAndView
	 * test2(@PathVariable(required = false, value="greeting") String greeting) {
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("greeting",
	 * greeting); return mv; }
	 */
}
