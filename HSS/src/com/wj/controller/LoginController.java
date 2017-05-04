package com.wj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wj.service.LoginService;

@Controller
@RequestMapping(value="/Login")
public class LoginController {
	
	@Autowired private LoginService loginService;
	
	@RequestMapping(value="/Login.do")
	public String login(@RequestParam(value="username") String username,
			@RequestParam(value="password")String password){
		int flag=loginService.login(username, password);
		if(flag==1){
			return "forward:/userIndex.jsp";
		}
		else if(flag==2){
			return "forward:/technicianIndex.jsp";
		}
		else if(flag==3){
			return "forward:/Repair/getAllRepairOrder";
		}
		else {
			return "redirect:/login.jsp";
		}
		
	}
	
}
