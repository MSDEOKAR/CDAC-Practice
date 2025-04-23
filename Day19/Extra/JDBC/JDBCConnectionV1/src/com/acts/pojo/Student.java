package com.acts.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Student implements Serializable{
	private static final long serialVersionUID = -7479867280500660596L;
	private Integer rollNo;
	private String name;
	private Date dob;
	private String course;
	private String centerName;
	
	public Student() {
		super();
	}

	public Student(Integer rollNo, String name, Date dob, String course, String centerName) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.course = course;
		this.centerName = centerName;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", course=" + course + ", centerName="
				+ centerName + "]";
	}

}
