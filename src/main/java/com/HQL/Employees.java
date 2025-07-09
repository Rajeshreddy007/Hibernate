package com.HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {
	
	@Id
	private int emp_id;
	
	private String emp_name;
	
	private int emp_age;
	
	private char emp_gender;
	
	private String emp_address;
	
	public Employees() {
		System.out.println("Employees Class Constructor");
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public char getEmp_gender() {
		return emp_gender;
	}

	public void setEmp_gender(char emp_gender) {
		this.emp_gender = emp_gender;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	@Override
	public String toString() {
		return "Employees [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_age=" + emp_age + ", emp_gender="
				+ emp_gender + ", emp_address=" + emp_address + "]";
	}
	
}
