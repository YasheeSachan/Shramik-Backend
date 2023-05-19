package com.FYP.shramik1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.FYP.shramik1.Service.SearchService;

import com.FYP.shramik1.Worker;

@RestController
@RequestMapping("/search")
@CrossOrigin("*")
public class SearchController {
	
	@Autowired
	SearchService service;
	
	@GetMapping("/getAllHelpers")
	public List<Worker> getAll()
	{
		return service.getAllWorkers();
	}
	
	@GetMapping("/getHelperByCategory/{subcategory}")
	public List<Worker> getHelper(@PathVariable String subcategory)
	{
		return service.getHelperBySubCategory(subcategory);
	}

}
