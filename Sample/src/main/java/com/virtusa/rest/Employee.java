package com.virtusa.rest;

public class Employee {

	private Integer eno;
	private String name;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + "]";
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
	
	
}
