package com.crudOperations.Employee.bean;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EmployeeInfo")

public class EmployeeInfo {
	
	@Id
	private String id;
	private String name;
	private String salary;
	private Integer age;
	private Boolean enabled;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeInfo(String id, String name, String salary, Integer age, Boolean enabled) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.enabled = enabled;
	}
	public EmployeeInfo() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", enabled="
				+ enabled + "]";
	}
	
	
	
}
