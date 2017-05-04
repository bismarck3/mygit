package com.wj.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.wj.entity.JgxTechnicianUser;
import com.wj.entity.JgxUser;

@Repository
public class LoginDAO {

	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings({ "unchecked" })
	public int login(String username,String password){
		//用户返回1
		
		List<JgxUser> jgxUser=(List<JgxUser>)this.getSession().createCriteria(JgxUser.class).list();
		for (JgxUser user : jgxUser) {
			if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
				return 1;
			}
		}
		
		//技师返回2
		List<JgxTechnicianUser> jgxTechnicianUsers=this.getSession().createCriteria(JgxTechnicianUser.class).list();
		for (JgxTechnicianUser techUser : jgxTechnicianUsers) {
			if(techUser.getUsername().equals(username)&&techUser.getPassword().equals(password)){
				return 2;
			}
		}
		
		//后台返回3
		if("admin".equals(username)&&"admin".equals(password)){
			return 3;
		}
		return 0;
	}
}
