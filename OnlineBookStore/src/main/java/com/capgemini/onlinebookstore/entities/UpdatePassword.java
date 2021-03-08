package com.capgemini.onlinebookstore.entities;

public class UpdatePassword {
	
	private long userId;
	private String oldPassword;
	private String newPassword;
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
