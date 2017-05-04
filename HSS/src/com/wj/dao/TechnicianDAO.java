package com.wj.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.wj.entity.Technician;

@Repository
public class TechnicianDAO {

	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Technician> getAllTechnician(){
		return (List<Technician>)this.getSession().createCriteria(Technician.class).list();
	}
	
	public void addTechnician(Technician technician){
		this.getSession().save(technician);
	}
	
	public void deleteTechnician(Technician technician){
		this.getSession().delete(technician);
	}
	
	public void deleteTechnician(Integer id){
		this.getSession().createQuery("delete from technician where id=?")
			.setParameter(0, id).executeUpdate();
	}
	public void updateTechnician(Technician technician){
		this.getSession().update(technician);
	}
	
	public Technician getTechnician(Technician technician){
		return this.getTechnicianById(technician.getId());
	}
	
	public Technician getTechnicianById(Integer id){
		return (Technician)this.getSession().createQuery("from technician where id = ?").setParameter(0, id).uniqueResult();
	}
	
	
}
