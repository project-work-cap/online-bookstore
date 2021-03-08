package com.capgemini.onlinebookstore.entities;

import java.util.List;

<<<<<<< HEAD
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
=======
>>>>>>> parent of a1d7f73 (added entities)
public class Role {

	@Id
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
