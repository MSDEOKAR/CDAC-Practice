package com.acts.tester;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.acts.db.dao.EmployeeDao;
import com.acts.db.dao.impl.EmployeeDaoImpl;
import com.acts.pojo.Employee;

public class EmployeeAppTester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			EmployeeDao employeeDao = new EmployeeDaoImpl();
			boolean exit = false;
			int choice = 0;
			while (!exit) {
				System.out.println(
						"\n 1.Add / Save Employee"
								+ "\n 2.Update Employee Salary"
								+ "\n 3.Print all Employee"
								+ "\n 4.Get employee by empid"
								+ "\n 5.Get employee count by dept"
								+ "\n 6.Delete employee "
								+ "\n 0.Save in file and Exit");

				System.out.println("Please enter choice:");
				choice = sc.nextInt();
				try {
					switch (choice) {
					case 1: {//Add Employee
						//Get Employee details from user
						System.out.println("Enter EmpId");
						Integer empId = sc.nextInt();

						System.out.println("Enter name");
						String name = sc.next();

						System.out.println("Enter date of joining-yyyy-MM-dd");
						String date = sc.next();
						Date doj = Date.valueOf(date);

						System.out.println("Enter dept");
						String dept = sc.next();

						System.out.println("Enter Salary");
						Double salary = sc.nextDouble();

						Employee e1 = new Employee(empId, name, doj, dept, salary);
						employeeDao.saveEmployee(e1);
						System.out.println("Employee saved successfully");

					} break;
					case 2: {
						System.out.println("Enter Employee ID");
						Integer empId = sc.nextInt();
						Optional<Employee> employee = employeeDao.getEmployeeByEmployeeId(empId);
						if (employee.isEmpty()) {
							System.out.println("Employee Not Found");
						} else {
							System.out.println("Employee Found");
							System.out.println("Enter new salary for Employee");
							Double salary = sc.nextDouble();
							employeeDao.updateEmployeeSalary(salary, empId);
							System.out.println("Employee salary updated");
						}
					} break;
					case 3: {
						System.out.println("All Employees ");
						//Get all employees.
						List<Employee> empList = employeeDao.getAllEmployees();
						empList.forEach(System.out::println);
					}break;
					case 4: {
						System.out.println("Enter Employee ID");
						Integer empId = sc.nextInt();
						Optional<Employee> employee = employeeDao.getEmployeeByEmployeeId(empId);
						employee.ifPresent(System.out::println);
					}break;

					case 5: {
						System.out.println("Enter Dept Name");
						String dept = sc.next();
						int count = employeeDao.getCountByDept(dept);
						System.out.println("Count = "+ count);
					}break;

					case 6: {
						// Delete Employee 
						System.out.println("Enter Employee ID");
						Integer empId = sc.nextInt();
						employeeDao.deleteEmployee(empId);
						System.out.println("Employee deleted successfully");
					} break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine(); // Eater
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

