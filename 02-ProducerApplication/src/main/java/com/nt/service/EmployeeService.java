package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public String saveEmp(Employee emp) {
		Integer empEno = repo.save(emp).getEmpEno();
		return "Employee with the id: "+empEno+" is saved successfully";
	}

}
