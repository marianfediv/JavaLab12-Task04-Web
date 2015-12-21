package com.epam.lab.model;

import java.io.Serializable;

public class Developer extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer qualificationId;
	private Integer developerId;
	private Double salary;
	private boolean employment;

	public Integer getQualificationId() {
		return qualificationId;
	}

	public void setQualificationId(Integer qualificationId) {
		this.qualificationId = qualificationId;
	}

	public Integer getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(Integer developerId) {
		this.developerId = developerId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public boolean isEmployment() {
		return employment;
	}

	public void setEmployment(boolean employment) {
		this.employment = employment;
	}

}
