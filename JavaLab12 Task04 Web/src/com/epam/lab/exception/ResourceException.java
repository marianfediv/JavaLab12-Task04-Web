package com.epam.lab.exception;

import java.sql.SQLException;

public class ResourceException extends SQLException {
	
	private static final long serialVersionUID = 1L;
	private String exceptionMessage = "";

	public ResourceException() {
		super();
	}

	public ResourceException(String exceptionMessage) {
		super(exceptionMessage);
		this.exceptionMessage = exceptionMessage;
	}

	@Override
	public String toString() {
		return exceptionMessage;
	}
}
