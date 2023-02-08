package com.crudOperations.Employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.crudOperations.Employee.bean.EmployeeInfo;

public interface EmployeeInfoRepo extends CrudRepository <EmployeeInfo,String> {
	
	@Query(value="SELECT * FROM employee_info  WHERE name=:name",nativeQuery=true)
	public EmployeeInfo getByEmployee(String name);

	@Query(value="UPDATE employee_info SET salary=:salary",nativeQuery=true)
	public void getBySalary(String salary);
	
	@Query(value="SELECT name,age FROM employee_info ",nativeQuery=true)
	List <Object>  showDetails(String name,int age);
	
}