package com.wj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.wj.entity.RepairOrder;
import com.wj.service.RepairService;

@Controller
@RequestMapping(value="/Repair")
@SessionAttributes
public class RepairController {

	@Autowired private RepairService repairService;

	@RequestMapping(value="/getAllRepairOrder")
	public String getAllRepairOrder(Map<String, Object> map){
		List<RepairOrder> repairOrderList=repairService.getAllRepairOrder();
		map.put("repairOrderList", repairOrderList);
		return "admin";
	}
	
	@RequestMapping(value="/AddRepairOrder")
	public String addRepairOrder(RepairOrder repairOrder){
		repairService.addRepairOrder(repairOrder);
		return "forward:getAllRepairOrder";
	}
	
	@RequestMapping(value="/UserAddRepairOrder")
	public String userAddRepairOrder(RepairOrder repairOrder,Map<String, Object> map){
		repairService.addRepairOrder(repairOrder);
		repairOrder.setState(repairService.getRepairOrder(repairOrder).getState());
		map.put("order", repairOrder);
		return "RepairOrderSuccess";
	}
	
	@RequestMapping(value="/ChangeRepairOrderStateById")
	public String changeRepairOrderStateById(@RequestParam(value="id")Integer id,
			@RequestParam(value="state")String state){
		repairService.changeRepairOrderById(id, state);
		return "forward:getAllRepairOrder";
	}
	
	@RequestMapping(value="/deleteRepairOrderById")
	public String deleteRepairOrderById(@RequestParam(value="id")Integer id){
		repairService.deleteRepairOrderById(id);
		return "forward:getAllRepairOrder";
	}
	
}
