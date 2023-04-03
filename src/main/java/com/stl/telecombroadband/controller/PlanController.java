package com.stl.telecombroadband.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.telecombroadband.entity.Plans;
import com.stl.telecombroadband.repo.PlanRepo;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/user")
public class PlanController {

	@Autowired
	private PlanRepo planrepo;
	
	@GetMapping("/plans")
	public ResponseEntity<List<Plans>> getAllPlans(){
		List<Plans> plan=planrepo.findAll();
		return ResponseEntity.ok(plan);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Plans> addPlan(@RequestBody Plans plan) {
		planrepo.save(plan);
		return ResponseEntity.ok(plan);
}
}

