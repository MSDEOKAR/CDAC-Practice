package com.acts.db.constants;

public class DbConstants {

	public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	public static final String SELECT_STUDENTS = "select * from student";
	public static final String GET_STUDENTS_BY_ROLLNO = "select * from student where rollno = ?";
	public static final String INSERT_STUDENT = "insert into student values(?, ?, ?, ?, ?)";
	public static final String UPDATE_STUDENT_COURSE = "update student set course = ? WHERE rollNo=?";
	public static final String DELETE_STUDENT = "delete from student where rollNo=?";
	
	private DbConstants() {
		//Default ctor to avoid object creation
	}
}
