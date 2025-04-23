package com.acts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertTester {
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	   static final String USER_NAME = "root";
	   static final String PASSWORD = "root";

	   public static void main(String[] args) {
	      // Open a connection in try with resource
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	         Statement stmt = conn.createStatement();) {		      
	         // Execute a query on statement
	         System.out.println("Inserting records into Student table");          
	         String sql = "INSERT INTO student(RollNo,Name,DOB,Course,CenterName) VALUES(107,'Rupak Joshi','2000-01-01','DAC','ACTS');";
	         stmt.executeUpdate(sql);
	         System.out.println("Inserted records sucessfully");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
}

