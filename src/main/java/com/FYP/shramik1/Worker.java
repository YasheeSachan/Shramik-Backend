package com.FYP.shramik1;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Worker")
public class Worker {
	@Id
	private BigInteger id;
	private String userName;
	private String mobNumber;
	private String category;
	private String subCategory;
	
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Worker(BigInteger id, String userName, String mobNumber, String category, String subCategory) {
		super();
		this.id = id;
		this.userName = userName;
		this.mobNumber = mobNumber;
		this.category = category;
		this.subCategory = subCategory;
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

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", userName=" + userName + ", mobNumber=" + mobNumber + ", category=" + category
				+ ", subCategory=" + subCategory + "]";
	}
	
}
