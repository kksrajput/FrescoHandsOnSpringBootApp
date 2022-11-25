package com.fresco.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Implement User Roles
@Entity
public class Role{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int roleId;
	
	@Column(name = "role")
	public String role;
	
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}