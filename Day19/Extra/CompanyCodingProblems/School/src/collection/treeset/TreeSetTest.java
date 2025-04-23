package collection.treeset;

import java.util.TreeSet;


public class TreeSetTest {
static public void main(String[] args) {
	Employee employee1 = new Employee("Praphul", 102157);
	Employee employee2 = new Employee("Dipak", 102158);
	TreeSet<Employee> employees = new TreeSet<Employee>();
	employees.add(employee1);
	employees.add(employee2);
	System.out.println(employees);
	
	
	String str1 ="Praphul";
	String str2 =" Dipak";
	String str3 =" Nishant";
	TreeSet<String> stSet = new TreeSet<String>();
	stSet.add(str1);
	stSet.add(str2);
	stSet.add(str3);
	System.out.println(stSet);
	
	
}
}
