package com.crudOperations.Employee.controller;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crudOperations.Employee.bean.EmployeeInfo;

import com.crudOperations.Employee.services.EmployeeInfoServices;

@RestController
public class EmployeeInfoController {
	
	@Autowired
	private EmployeeInfoServices empService;

	@RequestMapping("/information")
	public List<EmployeeInfo> getAllInformation(){
		return empService.getAllInformation();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/information")
	public void addInfo(@RequestBody EmployeeInfo empInfo) {
		 empService.addInfo(empInfo);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/information/{id}")
	public void updateInfo(@PathVariable String id,@RequestBody EmployeeInfo empInfo) {
		empService.updateInfo(id,empInfo);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/information/{id}")
	public void deleteInfo(@PathVariable String id) {
		empService.deleteInfo(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/informations/")
	public void addEmployee(@RequestBody EmployeeInfo empInfo) {
		empService.createEmployee(empInfo);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/update")
	public String updateEmployee(@RequestBody EmployeeInfo empInfo) {
		return empService.updateEmployee(empInfo);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/show")
	public Object showEmployee(@RequestBody EmployeeInfo empInfo) {
		return empService.showEmployee(empInfo);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/isEnabled")
	public String enabledEmployee(@RequestBody EmployeeInfo empInfo) {
		return empService.enabledEmployee(empInfo);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/isEmployeeExists")
	public String isEmployeeExists(@RequestBody EmployeeInfo empInfo) {
		return empService.isEmployeeExists(empInfo);
	}
	
}
