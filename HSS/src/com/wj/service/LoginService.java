package com.wj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.dao.LoginDAO;

@Service
public class LoginService {

	@Autowired private LoginDAO loginDAO;
	
	public int login(String username,String password){
		return loginDAO.login(username, password);
	}
}
