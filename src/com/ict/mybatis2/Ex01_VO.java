package com.ict.mybatis2;

public class Ex01_VO {
	private String idx, id, password, username, age, regdate;
	
	public Ex01_VO() {}

	public Ex01_VO(String idx, String id, String password, String username, String age, String regdate) {
		this.idx = idx;
		this.id = id;
		this.password = password;
		this.username = username;
		this.age = age;
		this.regdate = regdate;
	}

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
