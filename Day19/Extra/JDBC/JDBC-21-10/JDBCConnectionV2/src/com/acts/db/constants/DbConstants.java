package com.acts.db.constants;

public class DbConstants {

	//Connection constants
	public static final String DB_URL = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	//Student queries
	public static final String SELECT_STUDENTS = "select * from student";
	public static final String GET_STUDENTS_BY_ROLLNO = "select * from student where rollno = ?";
	public static final String INSERT_STUDENT = "insert into student values(?, ?, ?, ?, ?)";
	public static final String UPDATE_STUDENT_COURSE = "update student set course = ? where rollNo = ?";
	public static final String DELETE_STUDENT = "delete from student where rollNo = ?";
	//Employee Queries
	public static final String SELECT_EMPLOYEES = "select * from employee";
	public static final String GET_EMPLOYEES_BY_EMPID = "select * from employee where empid = ?";
	public static final String INSERT_EMPLOYEE = "insert into employee values(?, ?, ?, ?, ?)";
	public static final String UPDATE_EMPLOYEE_DEPT = "update employee set dept = ? where empid = ?";
	public static final String DELETE_EMPLOYEE = "delete from employee where empid = ?";
	
	private DbConstants() {
		//Default Private ctor to avoid object creation
	}
}
