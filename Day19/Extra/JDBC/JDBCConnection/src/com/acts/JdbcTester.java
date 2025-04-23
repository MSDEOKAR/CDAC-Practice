package com.acts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTester {

	// Main driver method
	public static void main(String[] args) throws SQLException
	{
		// Try block to check if any exceptions occurs
		Connection con = null;
		try {

			// Step 1: Loading and registering drivers
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Registering driver using DriverManager
			// Step 2: Establish a connection
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");

			// Step 3: Create a statement
			Statement s = con.createStatement();

			// Step 4: Execute the query
			ResultSet resultSet = s.executeQuery("select * from student");

			// Step 5: Process the results

			// Condition check using next() method
			// to check for element
			while (resultSet.next()) {
				// Print and display elements
				System.out.println("********Student Data********");
				System.out.println("Student RollNO : " + resultSet.getInt(1));
				System.out.println("Name : " + resultSet.getString(2));
				System.out.println("DOB : " + resultSet.getDate(3));
				System.out.println("Course : " + resultSet.getString(4));
				System.out.println("Center Name : " + resultSet.getString(5));
			}
		}

		// Catch statement for DB exceptions
		catch (SQLException e) {
			// Print the exception
			System.out.println(e);
		}

		// Catch block for generic class exceptions
		catch (ClassNotFoundException e) {
			// Print the line number where exception occurred
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
}

