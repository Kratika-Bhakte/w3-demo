package com.crudOperations.Employee.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crudOperations.Employee.bean.EmployeeInfo;

import com.crudOperations.Employee.repository.EmployeeInfoRepo;


@Service
public class EmployeeInfoServices {
	
	@Autowired
	public EmployeeInfoRepo emp;
	
	public EmployeeInfo e;
	
	public List<EmployeeInfo> getAllInformation(){
		
		List<EmployeeInfo> empInfo=new ArrayList<>();
		emp.findAll().forEach(empInfo::add);
		return empInfo;
		
	}
	public Object addInfo(EmployeeInfo empInfo) {
		emp.save(empInfo);
		return empInfo;
	}
	public void updateInfo(String id, EmployeeInfo empInfo) {
		emp.save(empInfo);
		
	}
	public void deleteInfo(String id) {
		emp.deleteById(id);
	}
	
	
	public void createEmployee(EmployeeInfo empinfo) {
		if(emp.getByEmployee(empinfo.getName())==null) {
			emp.save(empinfo);
		}
		else {
			System.out.print("Employee exist");
		}
	}
	
	public String updateEmployee(EmployeeInfo empinfo) {
		
		if(emp.getByEmployee(empinfo.getName())!=null) {
			emp.getBySalary(empinfo.getSalary());
			
			return "Exists";
			
		}
		else {
			return "Employeee does not exist";
		}
	
		
		
	}
	
	
	public Object showEmployee(EmployeeInfo empInfo) {
		
		if(emp.getByEmployee(empInfo.getName())==null) {
			return "Not Exists";
		}
		else {
			return emp.showDetails(empInfo.getName(),empInfo.getAge());
		}
			
	
	}
	
	public  String enabledEmployee(EmployeeInfo empInfo) {
		if(empInfo.getEnabled()==true) {
			return "Entries are:" +empInfo.getName();
		}
		else {
			return "No Enabled Entries Found";
		}
		
	}
	
	public String isEmployeeExists(EmployeeInfo empInfo) {
		if(emp.getByEmployee(empInfo.getName())==null) {
			return "Employee with "+empInfo.getName()+" not exists";
		}
		return "Employee with "+empInfo.getName()+" exists";
	}
	
	
}
	

