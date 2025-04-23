package collection;

import java.util.*;

class Employee
{
	private int age;    
	private String name;

	public void setAge(int age)
	{
		this.age=age;    
	}

	public int getAge()
	{
		return this.age;    
	}

	public void setName(String name)
	{
		this.name=name;    
	}

	public String getName()
	{    
		return this.name;    
	}
}

/*
      User defined Java comparator.
      To create custom java comparator Implement Comparator interface and
      define compare method.

      The below given comparator compares employees on the basis of their age.
 */

class AgeComparator implements Comparator<Employee>
{

	public int compare(Employee emp1, Employee emp2){

		/*
		 * parameter are of type Object, so we have to downcast it
		 * to Employee objects
		 */

		int emp1Age = ((Employee)emp1).getAge();        
		int emp2Age = ((Employee)emp2).getAge();

		if(emp1Age > emp2Age)
			return 1;
		else if(emp1Age < emp2Age)
			return -1;
		else
			return 0;    
	}

}

/*
      The below given comparator compares employees on the basis of their name.
 */

class NameComparator implements Comparator<Employee>
{

	public int compare(Employee emp1, Employee emp2){    

		//parameter are of type Object, so we have to downcast it to Employee objects

		String emp1Name = ((Employee)emp1).getName();        
		String emp2Name = ((Employee)emp2).getName();

		//uses compareTo method of String class to compare names of the employee
		return emp1Name.compareTo(emp2Name);

	}
}

/*
      This Java comparator example compares employees on the basis of
      their age and name and sort it in that order.
 */

public class JavaComparatorExample
{
	public static void main(String args[])
	{
		LinkedList<Employee> objLLEmp = new LinkedList<Employee>();
		for(int i =0;i< 10;i++)
		{
			Employee emp = new Employee();
			Random rm = new Random();

			UUID uuid = UUID.randomUUID();
			String myRandom = uuid.toString();
			emp.setAge(rm.nextInt(100));
			emp.setName(myRandom);
			objLLEmp.add(emp);
			objLLEmp.add(emp);
		}

		for(Employee emp : objLLEmp)
		{
			System.out.println( "Employee Name :: " + emp.getName() + "  Age :: " + emp.getAge());
		}
		System.out.println( "****************************Contents of Hash set********************************");
		HashSet<Employee> objHashSet = new HashSet<Employee>(objLLEmp);
		for(Employee emp : objHashSet)
		{
			System.out.println( "Employee Name :: " + emp.getName() + "  Age :: " + emp.getAge());
		}

		System.out.println( "****************************Contents of Sorted List********************************");

		LinkedList<Employee> objSortedList = new LinkedList<Employee>();
		objSortedList.addAll(objHashSet);
		Collections.sort(objSortedList, new AgeComparator());
		for(Employee emp : objSortedList)
		{
			System.out.println( "Employee Name :: " + emp.getName() + "  Age :: " + emp.getAge());
		}
	}
}


