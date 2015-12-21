package com.epam.lab.factory;

import com.epam.lab.service.Service;
import com.epam.lab.service.UserService;

public class ServiceFactory {

	private static Service userService = new UserService();

	public static Service getUserService() {
		return userService;
	}
}
