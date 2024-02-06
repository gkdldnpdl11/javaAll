package com.ict.day12;

// 무조건 부모가 먼저 만들어져야 한다
// 객체를 생성하기 위해서는 부모생성자가 실행되어야한다
// 부모생성자가 실행을 하지 못하면 자식생성자는 아예 실행이 되지 않는다

public class Ex07_Animal {
	String name="동물";
	int age=0;
	//	public Ex07_Animal() {
	//		System.out.println("부모 생성자");
	//	}
	
	public Ex07_Animal(String name, int age) {
		System.out.println("부모 생성자");
		this.name=name;
		this.age= age;
	}
	
}
