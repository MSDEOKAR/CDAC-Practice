package com.acts.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Employee implements Serializable{
	private static final long serialVersionUID = -3213079862730128150L;
	private Integer empid;
	private String name;
	private Date doj;
	private String dept;
	private Double salary;
	
	public Employee() {
		super();
	}

	public Employee(Integer empid, String name, Date doj, String dept, Double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.doj = doj;
		this.dept = dept;
		this.salary = salary;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", doj=" + doj + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	
}
