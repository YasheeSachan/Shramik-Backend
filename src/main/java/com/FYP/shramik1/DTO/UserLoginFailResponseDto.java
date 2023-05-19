package com.FYP.shramik1.DTO;

public class UserLoginFailResponseDto {
	
	private String message;

	public UserLoginFailResponseDto(String message) {
		super();
		this.message = message;
	}

	public UserLoginFailResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserLoginFailResponseDto [message=" + message + "]";
	}
	

}
