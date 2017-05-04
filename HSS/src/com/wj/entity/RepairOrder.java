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
 * ��������entity��	
 *
 */
@Entity
@Table(name="repair_order")	
public class RepairOrder implements Serializable{

	private static final long serialVersionUID = 8899014679057532566L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable=false,unique=true)
	private Integer id;//������
	
	@Column(name="type",nullable=false)
	private String type;//��������
	
	@Column(name="description",nullable=false)
	private String description;//��������
	
	@Column(name="picture",nullable=true)
	private String picture;//����ͼƬ
	
	@Column(name="date",nullable=false)
	private String date;//����ʱ��
	
	@Column(name="expected_time",nullable=false)
	private String expectedTime;//��������ʱ��
	
	@Column(name="name",nullable=false)
	private String name;//����
	
	@Column(name="telephone",nullable=false)
	private String telephone;//�绰
	
	@Column(name="address",nullable=false)
	private String address;//��ַ

	@Column(name="state",insertable=false,columnDefinition="varchar(10) default '1' not null")
	private String state;//����״̬(Ĭ��Ϊ1�������ύ,2�����ɵ���,3�����������)
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
