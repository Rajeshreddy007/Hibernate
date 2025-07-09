package com.Associations;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Students {
	@Id
	private int sid;

	private String name;

	@ManyToMany
	private List<Courses> cou;

	public Students() {
		System.out.println("Student Class Constructor");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Courses> getCou() {
		return cou;
	}

	public void setCou(List<Courses> cou) {
		this.cou = cou;
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", name=" + name + ", cou=" + cou + "]";
	}

}