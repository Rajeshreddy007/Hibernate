package com.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@Column(name = "Eid")
	private int eid;

	private String name;
	private int age;
	private String city;

	public Employee() {
		System.out.println("Employee Constructor Called");
	}

	public int getSid() {
		return eid;
	}

	public void seteid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "student [Eid=" + eid + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
