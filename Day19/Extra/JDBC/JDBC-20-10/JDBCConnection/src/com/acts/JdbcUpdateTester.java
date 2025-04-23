package com.acts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.acts.pojo.Student;

public class JdbcUpdateTester {
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	static final String USER_NAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args) {
		// Open a connection
		try(Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
				Statement stmt = conn.createStatement();
				) {		      
			String sql = "update student set course = 'DIOT' WHERE rollNo=103";
			//Update query
			stmt.executeUpdate(sql);

			ResultSet resultSet = stmt.executeQuery("Select * from student");
			List<Student> studentList = new ArrayList<Student>();
			while (resultSet.next()) {
				// Print and display elements
				Student student = new Student(resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getDate(3),
						resultSet.getString(4),
						resultSet.getString(5));
				studentList.add(student);
			}

			studentList.forEach(System.out::println);
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}

