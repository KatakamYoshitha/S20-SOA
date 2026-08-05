package com.klu.EMS;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepositpory er;
	
	@PostMapping("/add")
	public void insert(@RequestBody Employee e) {
		er.save(e);
	}
	
	@GetMapping("/get")
	public List<Employee> retrieve() {
		return er.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int eno) {
		er.deleteById(eno);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable("id") int eno,@RequestBody Employee e) {
		e.setEno(eno);
		er.save(e);
	}
}
