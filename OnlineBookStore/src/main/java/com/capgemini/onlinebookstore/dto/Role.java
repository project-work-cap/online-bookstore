package com.capgemini.onlinebookstore.dto;

import java.util.List;

public class Role {

	private long roleId;
	private String userRole;
	private List<UserBookStore> users;
	
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
	public List<UserBookStore> getUsers() {
		return users;
	}
	public void setUsers(List<UserBookStore> users) {
		this.users = users;
	}
	

}
