package com.acts.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.acts.db.constants.DbConstants;

public class ConnectionFactory {
	/**
	 * Get a connection to database
	 * @return Connection
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(
				DbConstants.DB_URL,
				DbConstants.USER_NAME,
				DbConstants.PASSWORD);
		return conn;
	}
}
