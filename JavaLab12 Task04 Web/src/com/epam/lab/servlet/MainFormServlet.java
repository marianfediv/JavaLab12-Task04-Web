package com.epam.lab.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.lab.controller.LocaleSingleton;

public class MainFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("language") != null) {
			String[] planguage = request.getParameter("language").split("_");
			LocaleSingleton.getInstance().setLocal(planguage[0], planguage[1]);
		}
		
		LocaleSingleton.getInstance().setLocale(request);
		request.getRequestDispatcher("pages/main_page.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
