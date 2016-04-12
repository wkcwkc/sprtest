package com.model;

public class MyModel {
	private String name;
	private String password;
	private int id;

	private WorkInfoModel workInfo;
	private SchoolInfoModel schoolInfo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public WorkInfoModel getWorkInfo() {
		return workInfo;
	}

	public void setWorkInfo(WorkInfoModel workInfo) {
		this.workInfo = workInfo;
	}

	public SchoolInfoModel getSchoolInfo() {
		return schoolInfo;
	}

	public void setSchoolInfo(SchoolInfoModel schoolInfo) {
		this.schoolInfo = schoolInfo;
	}
	
	@Override
	public String toString() {
		return "MyModel [name=" + name + ", password=" + password
				+ ", workInfo=" + workInfo + ", schoolInfo=" + schoolInfo + "]";
	}

}
