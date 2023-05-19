package com.FYP.shramik1.DTO;

import java.math.BigInteger;

public class UserResponseDto {
	 private BigInteger id;
	 private String userName;
	 private String message;
	public UserResponseDto(BigInteger id, String userName, String message) {
		super();
		this.id = id;
		this.userName = userName;
		this.message = message;
	}
	public UserResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserResponseDto [id=" + id + ", userName=" + userName + ", message=" + message + "]";
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
