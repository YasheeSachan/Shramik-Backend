package com.FYP.shramik1.Service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FYP.shramik1.Worker;
import com.FYP.shramik1.Repository.WorkerRepository;

@Service
public class AdminService {
	
	@Autowired
	WorkerRepository repository;
	
public Worker insertWorker(Worker worker) {
		
		return repository.save(worker);
		
	}

public String delete(Worker worker) {
	 repository.deleteById(worker.getId());
	 return "Deleted successfully";
}

public Worker updateWorker(Worker worker) {
	Worker w=repository.findById(worker.getId()).get();
	repository.delete(w);
	return repository.save(worker);
}



}
