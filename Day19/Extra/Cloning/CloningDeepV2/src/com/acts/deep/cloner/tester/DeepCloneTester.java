package com.acts.deep.cloner.tester;

import com.acts.deep.cloner.Address;
import com.acts.deep.cloner.Employee;

public class DeepCloneTester {

	public static void main(String[] args) throws Exception {
		Address address = new Address("Pashan", "411021");
		Employee employee1 = new Employee(101, "Deepak", address);
		System.out.println(employee1);
		
		//employee1 will be cloned and new object will created in HEAP
		Employee employee2 = employee1.clone();
		System.out.println(employee2);
		
		System.out.println("Is same object=" + (employee1 == employee2));
		//Changed empId of cloned Object
		employee2.setEmpId(102);
		employee2.setName("Deepika");
		employee2.getAddress().setLine1("Bandra");
		employee2.getAddress().setZip("400037");
		
		System.out.println(employee1);
		System.out.println(employee2);
	}
}
