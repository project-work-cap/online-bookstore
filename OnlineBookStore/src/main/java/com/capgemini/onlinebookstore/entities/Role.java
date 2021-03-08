package com.capgemini.onlinebookstore.entities;

import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	@Column

	@Id
	private long roleId;
	@Column
	private String userRole;
//	@Column
//	private List<UserBookStore> users;
	
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
//	public List<UserBookStore> getUsers() {
//		return users;
//	}
//	public void setUsers(List<UserBookStore> users) {
//		this.users = users;
//	}
	

}
