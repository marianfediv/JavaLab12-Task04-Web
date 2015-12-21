package com.epam.lab.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.lab.model.User;
import com.epam.lab.model.User.Gender;
import com.epam.lab.model.User.UserType;

public class UserTransformer {

	public User fromResultSetToObject(ResultSet rs) throws SQLException {

		User result = null;

		if (rs.next()) {
			result = new User();
			result.setFirstName(rs.getString("f_name"));
			result.setLastName(rs.getString("l_name"));
			result.setMiddleName(rs.getString("m_name"));
			result.setGender(Gender.valueOf(rs.getString("gender")));
			result.setEmail(rs.getString("phone"));
			result.setEmail(rs.getString("email"));
			result.setLogin(rs.getString("login"));
			result.setPassword(rs.getString("password"));
			result.setUserType(UserType.valueOf(rs.getString("user_type")));
		}
		return result;
	}
}
