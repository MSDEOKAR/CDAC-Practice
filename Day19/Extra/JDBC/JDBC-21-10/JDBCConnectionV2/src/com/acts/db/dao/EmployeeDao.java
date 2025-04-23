package com.acts.db.dao;
import java.util.List;
import java.util.Optional;

import com.acts.pojo.Employee;

public interface EmployeeDao {

	Optional<Employee> getEmployeeByEmployeeId(Integer empId);

	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

	void updateEmployeeSalary(Double salary, Integer empId);

	void deleteEmployee(Integer empId);
	
	Integer getCountByDept(String dept);
}
