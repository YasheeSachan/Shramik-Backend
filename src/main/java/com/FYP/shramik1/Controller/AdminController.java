package com.FYP.shramik1.Controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.FYP.shramik1.Worker;
import com.FYP.shramik1.Service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {
	
	@Autowired
	AdminService service;
	

	@PostMapping("/add-worker")
	public Worker addWorker(@RequestBody Worker worker)
	{
		return service.insertWorker(worker);
	}
	
	@DeleteMapping("/delete-worker")
	public String deleteWorker(@RequestBody Worker worker)
	{
		return service.delete(worker);
	}
	
	@PutMapping("update-worker")
	public Worker updateWorker(@RequestBody Worker worker)
	{
		return service.updateWorker(worker);
		
	}
}
