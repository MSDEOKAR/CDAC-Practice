package com.acts.db.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.acts.connections.ConnectionFactory;
import com.acts.db.constants.DbConstants;
import com.acts.db.dao.StudentDao;
import com.acts.pojo.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public Optional<Student> getStudentByRollNo(Integer rollNo) {
		Student student = null;
		try {
			//Get Connection
			Connection connection = ConnectionFactory.getConnection();
			//Create Statement
			PreparedStatement stmt = connection.prepareStatement(DbConstants.GET_STUDENTS_BY_ROLLNO);
			stmt.setInt(1, rollNo);

			//Execute the query
			ResultSet resultSet = stmt.executeQuery();

			//Process the results
			while (resultSet.next()) {
				student = new Student(resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getDate(3),
						resultSet.getString(4),
						resultSet.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(student);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList = new ArrayList<Student>();
		try {
			//Get Connection
			Connection connection = ConnectionFactory.getConnection();
			//Create Statement
			Statement stmt = connection.createStatement();

			//Execute the query
			ResultSet resultSet = stmt.executeQuery(DbConstants.SELECT_STUDENTS);

			//Process the results
			while (resultSet.next()) {
				Student student = new Student(resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getDate(3),
						resultSet.getString(4),
						resultSet.getString(5));
				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
		try {
			//Get Connection
			Connection connection = ConnectionFactory.getConnection();
			//Create Statement
			PreparedStatement stmt = connection.prepareStatement(DbConstants.INSERT_STUDENT);
			stmt.setInt(1, student.getRollNo());
			stmt.setString(2, student.getName());
			stmt.setDate(3, student.getDob());
			stmt.setString(4, student.getCourse());
			stmt.setString(5, student.getCenterName());

			//Execute the query
			int rows = stmt.executeUpdate();
			System.out.println(rows + " rows affected");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent(String course, Integer rollNo) {
		try {
			//Get Connection
			Connection connection = ConnectionFactory.getConnection();
			//Create Statement
			PreparedStatement stmt = connection.prepareStatement(DbConstants.UPDATE_STUDENT_COURSE);
			stmt.setString(1, course);
			stmt.setInt(2, rollNo);

			//Execute the query
			int rows = stmt.executeUpdate();
			System.out.println(rows + " rows affected");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(Integer rollNo) {
		try {
			//Get Connection
			Connection connection = ConnectionFactory.getConnection();
			//Create Statement
			PreparedStatement stmt = connection.prepareStatement(DbConstants.DELETE_STUDENT);
			stmt.setInt(1, rollNo);

			//Execute the query
			int rows = stmt.executeUpdate();
			System.out.println(rows + " rows affected");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
