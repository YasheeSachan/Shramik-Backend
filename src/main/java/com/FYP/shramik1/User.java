package com.FYP.shramik1;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;

@Document("User")
public class User {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private BigInteger id;
	private String userName;
	private String email;
	private String password;
	private String category;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(BigInteger id, String userName, String email, String password, String category) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.category = category;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", category=" + category + "]";
	}

	
	
	
	

}
