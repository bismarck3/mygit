package com.wj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ��ʦʵ����(id,username,telephone)
 * 
 * @author MacBook Air
 * 
 */
@Entity
@Table(name="technician")
public class Technician {

	@Id
	@Column(name = "id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;// ��ʦID

	@Column(name = "username", nullable = false)
	private String username;// ��ʦ����

	@Column(name = "telephone", nullable = false)
	private String telephone;// ��ʦ�绰

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
