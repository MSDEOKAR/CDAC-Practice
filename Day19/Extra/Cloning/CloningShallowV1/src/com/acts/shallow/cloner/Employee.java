package com.acts.shallow.cloner;

//Cloneable is Marker Interface
public class Employee  implements Cloneable {
	private Integer empId;
	private String name;
	private Address address;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String name, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}

	//Object class Clone method
	@Override
	public  Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
}
