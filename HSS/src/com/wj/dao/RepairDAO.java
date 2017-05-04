package com.wj.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.wj.entity.RepairOrder;

@Repository
public class RepairDAO {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<RepairOrder> getAllRepairOrder(){
		return (List<RepairOrder>)this.getSession().createCriteria(RepairOrder.class).list();
	}
	
	public void addRepairOrder(RepairOrder repairOrder){
		this.getSession().save(repairOrder);
	}
	
	public void deleteRepairOrder(RepairOrder repairOrder){
		this.getSession().delete(repairOrder);
	}
	
	public void deleteRepairOrderById(Integer id){
		this.getSession().createQuery("delete from RepairOrder where id=?")
			.setParameter(0, id);
	}
	
	public void updateRepairOrder(RepairOrder repairOrder){
		this.getSession().update(repairOrder);
	}
	
	public RepairOrder getRepairOrder(RepairOrder repairOrder){
		return this.getRepairOrderById(repairOrder.getId());
	}
	
	public RepairOrder getRepairOrderById(Integer id){
		return (RepairOrder) this.getSession().createQuery("from RepairOrder where id = ?").setParameter(0, id).uniqueResult();
	}
	
	public void changeRepairOrderStateById(Integer id,String state){
		this.getSession().createQuery("update RepairOrder set state=? where id=?")
			.setParameter(0, state).setParameter(1,id).executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	public List<RepairOrder> getRepairOrderListByState(String State){
		return (List<RepairOrder>)this.getSession().createQuery("from repair_order where state=?").setParameter(0, State).list();
	}
}
