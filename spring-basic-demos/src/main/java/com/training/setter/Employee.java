package com.training.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Employee {

	private String name;
	private double salary;
	private int emplooyeeId;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	@Value("${employee.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	@Value("${employee.salary}")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmplooyeeId() {
		return emplooyeeId;
	}
	@Value("${employee.emplooyeeId}")
	public void setEmplooyeeId(int emplooyeeId) {
		this.emplooyeeId = emplooyeeId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", emplooyeeId=" + emplooyeeId + ", address=" + address
				+ "]";
	}
	
	
	
	
	
	
}
