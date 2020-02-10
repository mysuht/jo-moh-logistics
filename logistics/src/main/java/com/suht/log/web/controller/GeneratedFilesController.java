package com.suht.log.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.suht.logistics_backend.dao.FacilityDAO;

@Controller
public class GeneratedFilesController {

	@Autowired
	FacilityDAO facilityDAO;
	/**
     * Handle request to download a PDF document
     */
    @RequestMapping(value = "/downloadPDF", method = RequestMethod.GET)
    public ModelAndView downloadPDF() {
    	
    	// return a view which will be resolved by an excel view resolver
        return new ModelAndView("pdfView", "listFacility", facilityDAO.list());
    }
    
}
