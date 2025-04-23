package com.acts.db.dao.impl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.acts.connections.DbConnection;
import com.acts.db.constants.DbConstants;
import com.acts.db.dao.EmployeeDao;
import com.acts.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Optional<Employee> getEmployeeByEmployeeId(Integer empId) {
		Employee employee = null;
		try(Connection connection = DbConnection.getConnection()){
			//Create Statement
			PreparedStatement stmt = connection.prepareStatement(
					DbConstants.GET_EMPLOYEES_BY_EMPID);
			stmt.setInt(1, empId);

			//Execute the query
			ResultSet resultSet = stmt.executeQuery();

			//Process the results
			while (resultSet.next()) {
				employee = new Employee(resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getDate(3),
						resultSet.getString(4),
						resultSet.getDouble(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<Employee>();
		try(//Get Connection
				Connection connection = DbConnection.getConnection();
				//Create Statement
				Statement stmt = connection.createStatement();) {

			//Execute the query
			ResultSet resultSet = stmt.executeQuery(DbConstants.SELECT_EMPLOYEES);

			//Process the results
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getDate(3),
						resultSet.getString(4),
						resultSet.getDouble(5));
				employeeList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}

	@Override
	public void saveEmployee(Employee employee) {
		try (//Get Connection
				Connection connection = DbConnection.getConnection();
				//Create Statement
				PreparedStatement stmt = connection.prepareStatement(DbConstants.INSERT_EMPLOYEE);
				){
			//Set auto commit to false
			connection.setAutoCommit(false);
			stmt.setInt(1, employee.getEmpid());
			stmt.setString(2, employee.getName());
			stmt.setDate(3, employee.getDoj());
			stmt.setString(4, employee.getDept());
			stmt.setDouble(5, employee.getSalary());

			//Execute the query
			int rows = stmt.executeUpdate();
			//Commit the changes
			connection.commit();
			System.out.println(rows + " rows affected");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmployeeSalary(Double salary, Integer empId) {
		try {
			//Get Connection
			Connection connection = DbConnection.getConnection();
			//Create Statement
			PreparedStatement stmt = connection.prepareStatement(
					DbConstants.UPDATE_EMPLOYEE_DEPT);
			stmt.setDouble(1, salary);
			stmt.setInt(2, empId);

			//Execute the query
			int rows = stmt.executeUpdate();
			System.out.println(rows + " rows affected");
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(Integer empId) {
		try {
			//Get Connection
			Connection connection = DbConnection.getConnection();
			//Create Statement
			PreparedStatement stmt = connection.prepareStatement(
					DbConstants.DELETE_EMPLOYEE);
			stmt.setInt(1, empId);

			//Execute the query
			int rows = stmt.executeUpdate();
			System.out.println(rows + " rows affected");
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Integer getCountByDept(String dept) {
		int count =0;
		try {
			//Get Connection
			Connection connection = DbConnection.getConnection();
			//Create Statement
			CallableStatement stmt = connection.prepareCall(
					"{call employee_count(?,?)}");
			stmt.setString(1, dept);
			stmt.registerOutParameter(2, Types.INTEGER);

			//Execute the query
			stmt.execute();
			//Get count as Out param
			count = stmt.getInt(2);
			System.out.println("Count =" + count);
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
}
