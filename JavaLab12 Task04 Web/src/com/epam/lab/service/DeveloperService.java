package com.epam.lab.service;

import java.sql.SQLException;

import com.epam.lab.dao.DeveloperDAO;
import com.epam.lab.model.Developer;

public class DeveloperService implements Service {

	public Developer getDeveloperInfo(Integer developerId) throws SQLException {
		return new DeveloperDAO().getDeveloperInfo(developerId);
	}

	@Override
	public void save(Object object) throws SQLException {
		new DeveloperDAO().save((Developer) object);
	}

}
