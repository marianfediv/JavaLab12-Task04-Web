package com.epam.lab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.lab.controller.PasswordHash;
import com.epam.lab.model.Developer;
import com.epam.lab.model.User;
import com.epam.lab.persistant.ConnectionManager;
import com.epam.lab.transformer.DeveloperTransformer;

public class DeveloperDAO extends UserDAO {

	private Connection connection = null;
	private PasswordHash passwordHash;
	private final String GET_DEVELOPER_INFO = "SELECT * FROM user join developer ON developer.developer_id = user.id WHERE developer_id = ?;";
	private final String NEW_DEVELOPER = "INSERT INTO developer (qualification_id, developer_id, salary, employment)  VALUES(?,?,?,?);";

	public Developer getDeveloperInfo(Integer developer_id) throws SQLException {

		Developer result = null;

		connection = ConnectionManager.getConnection();

		PreparedStatement stmt = connection.prepareStatement(GET_DEVELOPER_INFO);
		stmt.setInt(1, developer_id);

		ResultSet rs = stmt.executeQuery();

		result = new DeveloperTransformer().fromResultSetToObject(rs);

		return result;
	}

	public void save(User user) throws SQLException {

		PreparedStatement ps = null;
		passwordHash = new PasswordHash();

		connection = ConnectionManager.getConnection();
		ps = connection.prepareStatement(NEW_DEVELOPER);
		ps.setString(1, user.getFirstName());
		ps.setString(2, user.getLastName());
		ps.setString(3, user.getMiddleName());
		ps.setString(4, user.getGender().name());
		ps.setString(5, user.getPhone());
		ps.setString(6, user.getEmail());
		ps.setString(7, user.getLogin());
		ps.setString(8, passwordHash.getHash(user.getPassword()));
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
