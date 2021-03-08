package com.capgemini.onlinebookstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UpdatePassword {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	
	private long userId;
	@Column
	private String oldPassword;
	@Column
	private String newPassword;
	@Column
	private String emailId;
	
	
	public UpdatePassword() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "UpdatePassword [userId=" + userId + ", oldPassword=" + oldPassword + ", newPassword=" + newPassword
				+ ", emailId=" + emailId + "]";
	}
	public UpdatePassword(long userId, String oldPassword, String newPassword, String emailId) {
		super();
		this.userId = userId;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.emailId = emailId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	

}
