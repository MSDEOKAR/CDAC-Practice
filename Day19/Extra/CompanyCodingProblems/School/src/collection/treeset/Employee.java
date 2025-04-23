package collection.treeset;

public class Employee implements Comparable<Employee>
{

private String name;
private int empID;

public Employee(String name, int empID) {
	super();
	this.name = name;
	this.empID = empID;
}

@Override
public String toString() {
	return "Employee [empID=" + empID + ", name=" + name + "]";
}

@Override
public int compareTo(Employee o) {
	return name.compareTo(o.name);
}
}
