package com.app.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int empid;
	private List<String> skills=new ArrayList();
	private String city;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", skills=" + skills + ", city=" + city + "]";
	}

	

}
