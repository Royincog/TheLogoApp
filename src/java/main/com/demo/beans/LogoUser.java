package com.demo.beans;

public class LogoUser {

	private String userName;
	private String password;
	
	public LogoUser() {
		super();
	}
	public LogoUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LogoUser [userName=" + userName + ", password=" + password + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		LogoUser other = (LogoUser) obj;
		return ((other.getUserName().equals(this.userName)) && (other.getPassword().equals(this.password)));
		
	}
	
	
}
