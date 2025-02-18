package com.nt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@RestController
@RequestMapping("/emp/operations")
public class EmployeeControllerOperations {

	@Autowired
	private IEmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<Map<String,String>> employeeOperations(@RequestBody Employee emp){
		String message = service.saveEmp(emp);
		Map<String, String> response = new HashMap<>();
	    response.put("message", message);
		return new ResponseEntity<Map<String,String>>(response,HttpStatus.OK);
	}
}
