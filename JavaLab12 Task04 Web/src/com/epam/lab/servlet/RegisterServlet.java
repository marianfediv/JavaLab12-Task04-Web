package com.epam.lab.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.lab.controller.LocaleSingleton;
import com.epam.lab.controller.PasswordHash;
import com.epam.lab.factory.ServiceFactory;
import com.epam.lab.model.User;
import com.epam.lab.model.User.Gender;
import com.epam.lab.model.User.UserType;
import com.epam.lab.service.Service;

public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private LoginServlet loginServlet;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LocaleSingleton.getInstance().setLocale(request);
		request.getRequestDispatcher("pages/register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();
		PasswordHash passwordHash = new PasswordHash();

		user.setFirstName(new String(request.getParameter("f_name").getBytes("ISO-8859-1"), "UTF-8"));
		user.setLastName(new String(request.getParameter("l_name").getBytes("ISO-8859-1"), "UTF-8"));
		user.setMiddleName(new String(request.getParameter("m_name").getBytes("ISO-8859-1"), "UTF-8"));
		user.setGender(Gender.valueOf(request.getParameter("gender")));
		user.setPhone(request.getParameter("phone"));
		user.setEmail(new String(request.getParameter("email").getBytes("ISO-8859-1"), "UTF-8"));
		user.setLogin(new String(request.getParameter("login").getBytes("ISO-8859-1"), "UTF-8"));
		user.setPassword(passwordHash.getHash(request.getParameter("password")));
		user.setUserType(UserType.customer);

		Service userService = ServiceFactory.getUserService();
		LocaleSingleton.getInstance().setLocale(request);

		try {
			userService.save(user);
			loginServlet = new LoginServlet();
			loginServlet.setLogin(user.getLogin(), user.getPassword(), request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
