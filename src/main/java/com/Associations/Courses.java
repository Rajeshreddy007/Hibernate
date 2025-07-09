package com.Associations;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Courses {

	@Id
	private int cid;

	private String Coursename;

	@ManyToMany
	private List<Students> st;

	public Courses() {
		System.out.println("Courses Class Constructor");
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCoursename() {
		return Coursename;
	}

	public void setCoursename(String coursename) {
		Coursename = coursename;
	}

	public List<Students> getSt() {
		return st;
	}

	public void setSt(List<Students> st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", Coursename=" + Coursename + ", st=" + st + "]";
	}

}
