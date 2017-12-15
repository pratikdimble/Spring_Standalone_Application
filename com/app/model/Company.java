package com.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Company {
	private int compid;
	private List<String> skills=new ArrayList();
	private float salary;
	public int getCompid() {
		return compid;
	}
	public void setCompid(int compid) {
		this.compid = compid;
	}
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Company [compid=" + compid + ", skills=" + skills + ", salary=" + salary + "]";
	}

	
	
	
	
}
