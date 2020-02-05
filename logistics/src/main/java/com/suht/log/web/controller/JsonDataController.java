package com.suht.log.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suht.logistics_backend.dao.FacilityDAO;
import com.suht.logistics_backend.dto.Facility;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	private FacilityDAO facilityDAO;
	
	@RequestMapping("/all/facilities")
	@ResponseBody
	public List<Facility> getAllFacility(){
		return facilityDAO.list();
	}
	
	@RequestMapping("/facilityType/{typeId}/facilities")
	@ResponseBody
	public List<Facility> getFacilityByType(@PathVariable int typeId){
		return facilityDAO.list();
	}
}
