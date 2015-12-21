package com.epam.lab.model;

import java.io.Serializable;

public class TaskCommit implements Serializable {

	private static final long serialVersionUID = 1L;

	private String log;
	private Integer hourForTask;
	private Integer jobId;
	private Integer developerId;

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public Integer getHourForTask() {
		return hourForTask;
	}

	public void setHourForTask(Integer hourForTask) {
		this.hourForTask = hourForTask;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Integer getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(Integer developerId) {
		this.developerId = developerId;
	}

}
