package com.epam.lab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.lab.model.User;
import com.epam.lab.persistant.ConnectionManager;
import com.epam.lab.transformer.UserTransformer;

public class UserDAO implements JdbcDaoSupport {

	private Connection connection = null;
	private final String GET_USER = "SELECT * FROM user WHERE login = ? and password = ?;";
	private final String NEW_USER = "INSERT INTO user (f_name, l_name, m_name, gender, phone, email, login, password, user_type)  VALUES(?,?,?,?,?,?,?,?,?);";

	public User getUser(String login, String password) throws SQLException {

		User result = null;

		connection = ConnectionManager.getConnection();

		PreparedStatement stmt = connection.prepareStatement(GET_USER);
		stmt.setString(1, login);
		stmt.setString(2, password);

		ResultSet rs = stmt.executeQuery();

		result = new UserTransformer().fromResultSetToObject(rs);

		return result;
	}

	public void save(User user) throws SQLException {

		PreparedStatement ps = null;
		
		connection = ConnectionManager.getConnection();
		ps = connection.prepareStatement(NEW_USER);
		ps.setString(1, user.getFirstName());
		ps.setString(2, user.getLastName());
		ps.setString(3, user.getMiddleName());
		ps.setString(4, user.getGender().name());
		ps.setString(5, user.getPhone());
		ps.setString(6, user.getEmail());
		ps.setString(7, user.getLogin());
		ps.setString(8, user.getPassword());
		ps.setString(9, user.getUserType().name());
	
		ps.executeUpdate();
	}

	@Override
	public Connection getConnection() {
		return connection;
	}

	@Override
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}