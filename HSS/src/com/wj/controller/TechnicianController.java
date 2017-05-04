package com.wj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.wj.entity.Technician;
import com.wj.service.TechnicianService;

@Controller
@RequestMapping(value="/Technician")
@SessionAttributes("technicianList")
public class TechnicianController {

	@Autowired private TechnicianService technicianService;
	
	@RequestMapping(value="/getAllTechnician")
	public String getALLTechnician(Map<String, Object> map){
		List<Technician> technicianList=technicianService.getAllTechnician();
		map.put("technicianList", technicianList);
		return "TechnicianSuccess";
	}
	
	@RequestMapping(value="/AddTechnician")
	public String addRepairOrder(Technician technician){
		technicianService.addTechnician(technician);
		return "forward:getAllTechnician";
	}
	
	
	@RequestMapping(value="/operationOrder")
	public String operatioinOrder(@RequestParam(value="id")Integer id){
		
		
		return "forwad:getAllTechnician";
	}
}
