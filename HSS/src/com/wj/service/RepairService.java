package com.wj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.dao.RepairDAO;
import com.wj.entity.RepairOrder;


@Service
public class RepairService {

	@Autowired private RepairDAO repairDAO;

	public List<RepairOrder> getAllRepairOrder(){
		return repairDAO.getAllRepairOrder();
	}
	
	public void addRepairOrder(RepairOrder repairOrder){
		repairDAO.addRepairOrder(repairOrder);
	}
	
	public void deleteRepairOrder(RepairOrder repairOrder){
		repairDAO.deleteRepairOrder(repairOrder);
	}
	
	public void deleteRepairOrderById(Integer id){
		repairDAO.deleteRepairOrderById(id);
	}
	
	public void updateRepairOrder(RepairOrder repairOrder){
		repairDAO.updateRepairOrder(repairOrder);
	}
	
	public RepairOrder getRepairOrder(RepairOrder repairOrder){
		return repairDAO.getRepairOrder(repairOrder);
	}
	
	public RepairOrder getRepairOrderById(Integer id){
		return repairDAO.getRepairOrderById(id);
	}
	
	public void changeRepairOrderById(Integer id,String state){
		repairDAO.changeRepairOrderStateById(id, state);
	}
}

