package com.wj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="order_technician")
public class OrderToTechnician {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="o_id")
	private Integer O_id;
	
	@Column(name="t_id")
	private Integer T_id;

	public Integer getO_id() {
		return O_id;
	}

	public void setO_id(Integer o_id) {
		O_id = o_id;
	}

	public Integer getT_id() {
		return T_id;
	}

	public void setT_id(Integer t_id) {
		T_id = t_id;
	}
	
	
}
