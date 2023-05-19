package com.FYP.shramik1.Repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FYP.shramik1.Admin;

public interface AdminRepository extends MongoRepository<Admin, BigInteger> {

	Admin findByUserName(String userName);

	Admin findByPassword(String password);
	
	

}
