package com.epam.lab.persistant;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.epam.lab.exception.ResourceException;

public class ConnectionManager {

	private static Properties properties = new Properties();
	private static Connection connection = null;

	static {
		try {
			properties.load(ConnectionManager.class.getClassLoader().getResourceAsStream("db-config.properties"));
		} catch (IOException e) {
			System.out.println("db-config.properties file load error" + e);
		}
	}

	public static Connection getConnection() throws ResourceException {
		if (connection == null) {
			initializeConnection();
		}
		return connection;
	}

	private static void initializeConnection() throws ResourceException {
		try {
			Class.forName(properties.getProperty("driverClass"));

			try {
				connection = DriverManager.getConnection(properties.getProperty("url"),
						properties.getProperty("userName"), properties.getProperty("password"));
				System.out.println(connection);
			} catch (SQLException e) {
				throw new ResourceException(e.getMessage());
			}

		} catch (ClassNotFoundException e) {
			throw new ResourceException(e.getMessage());
		}
	}
}
