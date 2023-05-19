package com.FYP.shramik1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.FYP.shramik1.Worker;
import com.FYP.shramik1.Repository.WorkerRepository;

@Service
public class SearchService {
	
	@Autowired
	WorkerRepository repo;

	public List<Worker> getAllWorkers() {
		return repo.findAll();
	}

	public List<Worker> getHelperBySubCategory(String subcategory) {
		// TODO Auto-generated method stub
		return repo.findBysubCategory(subcategory);
		
	}

}
