package com.FYP.shramik1.Repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.FYP.shramik1.User;
import com.FYP.shramik1.Worker;

@Repository
public interface UserRepository extends MongoRepository<User, BigInteger> {

	User findByUserName(String userName);

	User findByPassword(String password);

	



}
