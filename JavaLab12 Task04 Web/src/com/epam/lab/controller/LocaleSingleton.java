package com.epam.lab.controller;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

public class LocaleSingleton {

	public static ResourceBundle localization;
	public static String currentPage;
	private String languageLocale = "en";
	private String countryLocale = "US";
	private Locale locale;
	
	private static LocaleSingleton instance = null;


	public static synchronized LocaleSingleton getInstance() {
		if (instance == null) {
			instance = new LocaleSingleton();
		}
		return instance;
	}
	
	public void setLocal(String languageLocale, String countryLocale){
		this.languageLocale = languageLocale;
		this.countryLocale = countryLocale;
	}
	
	public HttpServletRequest setLocale(HttpServletRequest request){
		
		locale = new Locale(this.languageLocale, this.countryLocale);
		localization = ResourceBundle.getBundle("content", locale, new UTF8Control("UTF-8"));
		request.setAttribute("login", localization.getString("LOGIN"));
		request.setAttribute("register", localization.getString("REGISTER"));
		request.setAttribute("home", localization.getString("HOME"));
		request.setAttribute("en", localization.getString("EN"));
		request.setAttribute("ua", localization.getString("UA"));
		request.setAttribute("about", localization.getString("ABOUT"));
		request.setAttribute("contact", localization.getString("CONTACT"));
		request.setAttribute("exit", localization.getString("EXIT"));
		request.setAttribute("development_team", localization.getString("DEVELOPER_TEAM"));
		request.setAttribute("language", localization.getString("LANGUAGE"));
		
		return request;
	}
}
