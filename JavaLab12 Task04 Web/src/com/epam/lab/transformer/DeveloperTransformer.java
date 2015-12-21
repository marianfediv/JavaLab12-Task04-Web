package com.epam.lab.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.lab.model.Developer;
import com.epam.lab.model.User.Gender;
import com.epam.lab.model.User.UserType;

public class DeveloperTransformer {
	public Developer fromResultSetToObject(ResultSet rs) throws SQLException {

		Developer result = null;

		if (rs.next()) {
			result = new Developer();
			result.setFirstName(rs.getString("f_name"));
			result.setLastName(rs.getString("l_name"));
			result.setMiddleName(rs.getString("m_name"));
			result.setGender(Gender.valueOf(rs.getString("gender")));
			result.setEmail(rs.getString("phone"));
			result.setEmail(rs.getString("email"));
			result.setLogin(rs.getString("login"));
			result.setPassword(rs.getString("password"));
			result.setUserType(UserType.developer);
			result.setQualificationId(rs.getInt("qualification_id"));
			result.setDeveloperId(rs.getInt("developer_id"));
			result.setSalary(rs.getDouble("salary"));
			result.setEmployment(rs.getBoolean("employement"));

		}
		return result;
	}
}
