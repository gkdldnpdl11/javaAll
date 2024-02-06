package com.ict.day18;

// VO (ValueObject), DTO (Data Transfer Object)
public class Ex08 {
	private String name;
	private int age;
	
	public Ex08() {} 		// 기본생성자

	public Ex08(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}