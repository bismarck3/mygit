package com.wj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.dao.TechnicianDAO;
import com.wj.entity.Technician;

@Service
public class TechnicianService {

	@Autowired private TechnicianDAO technicianDAO;

	public List<Technician> getAllTechnician(){
		return technicianDAO.getAllTechnician();
	}
	
	public void addTechnician(Technician technician){
		technicianDAO.addTechnician(technician);
	}
	
	public void deleteTechnician(Technician technician){
		technicianDAO.deleteTechnician(technician);
	}
	
	public void deleteTechnician(Integer id){
		technicianDAO.deleteTechnician(id);
	}
	
	public void updateTechnician(Technician technician){
		technicianDAO.updateTechnician(technician);
	}
	
	public Technician getTechnician(Technician technician){
		return technicianDAO.getTechnician(technician);
	}
	
	public Technician getTechnicianById(Integer id){
		return technicianDAO.getTechnicianById(id);
	}
	
}
