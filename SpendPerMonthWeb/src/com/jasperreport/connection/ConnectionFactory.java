package com.jasperreport.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/jasperreport", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
