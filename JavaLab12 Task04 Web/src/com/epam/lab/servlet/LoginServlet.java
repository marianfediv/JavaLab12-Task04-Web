package com.epam.lab.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.epam.lab.controller.LocaleSingleton;
import com.epam.lab.controller.PasswordHash;
import com.epam.lab.model.User;
import com.epam.lab.model.User.UserType;
import com.epam.lab.service.UserService;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private UserService userDAO;
	private PasswordHash passwordHash;
	private User user;
	private String login;
	private String password;

	public void setLogin(String login, String password, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.login = login;
		this.password = password;
		loginProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("password") != null && request.getParameter("username") != null) {
			passwordHash = new PasswordHash();
			login = request.getParameter("username");
			password = passwordHash.getHash(request.getParameter("password"));
			loginProcess(request, response);
		}
	}

	protected void loginProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		userDAO = new UserService();
		request.setAttribute("user_login", login);
		
		try {
			user = userDAO.getUser(login, password);

			if (user != null) {
				String role = user.getUserType().toString();

				HttpSession session = request.getSession();
				session.setAttribute("user", user.getFirstName() + " " + user.getLastName());

				if (role.equals(UserType.customer.toString())) {
					session.setAttribute("role", UserType.customer.toString());

				} else if (role.equals(UserType.developer.toString())) {
					session.setAttribute("role", UserType.developer.toString());

				} else if (role.equals(UserType.manager.toString())) {
					session.setAttribute("role", UserType.manager.toString());
				}
			}

		} catch (SQLException e) {
			request.setAttribute("error", "true");
			request.setAttribute("error_message", "Invalidate data");
		}

		LocaleSingleton.getInstance().setLocale(request);
		request.getRequestDispatcher("pages/main_page.jsp").forward(request, response);
	}
}
