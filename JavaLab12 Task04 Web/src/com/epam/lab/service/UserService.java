package com.epam.lab.service;

import java.sql.SQLException;

import com.epam.lab.dao.UserDAO;
import com.epam.lab.model.User;

public class UserService implements Service {

	public User getUser(String login, String password) throws SQLException {
		return new UserDAO().getUser(login, password);
	}

	@Override
	public void save(Object object) throws SQLException {
		new UserDAO().save((User) object);
	}
}
