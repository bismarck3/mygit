package com.wj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * 订单报修entity类	
 *
 */
@Entity
@Table(name="repair_order")	
public class RepairOrder implements Serializable{

	private static final long serialVersionUID = 8899014679057532566L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable=false,unique=true)
	private Integer id;//订单号
	
	@Column(name="type",nullable=false)
	private String type;//问题种类
	
	@Column(name="description",nullable=false)
	private String description;//问题描述
	
	@Column(name="picture",nullable=true)
	private String picture;//问题图片
	
	@Column(name="date",nullable=false)
	private String date;//报修时间
	
	@Column(name="expected_time",nullable=false)
	private String expectedTime;//期望上门时间
	
	@Column(name="name",nullable=false)
	private String name;//姓名
	
	@Column(name="telephone",nullable=false)
	private String telephone;//电话
	
	@Column(name="address",nullable=false)
	private String address;//地址

	@Column(name="state",insertable=false,columnDefinition="varchar(10) default '1' not null")
	private String state;//订单状态(默认为1——已提交,2——派单中,3——处理结束)
	/*
	 * get_set
	 */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getExpectedTime() {
		return expectedTime;
	}

	public void setExpectedTime(String expectedTime) {
		this.expectedTime = expectedTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/*
	 * construction
	 */

	public RepairOrder() {

	}
	
	
}
