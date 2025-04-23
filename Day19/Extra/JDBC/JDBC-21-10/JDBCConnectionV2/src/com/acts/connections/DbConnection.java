package com.acts.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.acts.db.constants.DbConstants;
//Connection
public class DbConnection {
	private static Connection connection;
	
	private DbConnection() {
		//private Ctor to stop Object creation from outside
	}
	
	/**
	 * Get a connection to database
	 * @return Connection
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException {
		if( null == connection || connection.isClosed()) {
			connection = DriverManager.getConnection(DbConstants.DB_URL,
					DbConstants.USER_NAME, DbConstants.PASSWORD);
		}
		return connection;
	}
}
