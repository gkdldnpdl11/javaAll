package com.ict.day11;

public class Ex01 {
	// 생성자 : 클래스를 객체로 만들때 한번 호출된다
	// 객체 생성 : 클래스이름 참조변수 =new 생성자([인자]);
	// 생성자의 목적 : 멤버필드(변수, 상수)의 초기값 지정
	// 생성자의 특징 : 클래스이름 = 저장이름 = 생성자이름
	//							반환형이 없는 메소드와 동일
	// 						메소드처럼 기능, 동작을 할 수 있다
	// 						클래스의 생성자가 없으면 기본생성자로 객체로 생성한다
	// 						기본생성자란 인자가 없는 생성자를 말한다
	// 						생성자도 오버로딩이 가능하다 (여러개의 생성자를 만들 수 있다)
	// 						생성자는 다른 생성자를 호출할 수 있다
	// 참조변수는 데이터를 가지고있는게 아니라 데이터를 가진 heap 주소를 가짐

	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";

	/*
	 * public Ex01() { System.out.println("Ex01 생성자"); // 초기값 지정. 위에 지정한 '일지매'의 초기값을
	 * 무시하고 만들어지는 기준이 생성자이므로 반환값은 '희동이'가 된다 name="희동이"; // 첫번째 목적 : 멤버 필드의 값을
	 * 지정(초기값) // 메소드처럼 다른 기능을 만들수도 있다 // 메소드처럼 다른 메소드를 호출할 수 있다 (메소드는 생성자를 호출할 수
	 * 없다) // 다른 생성자를 호출할 수 있다
	 * 
	 * }
	 */

	/*
	 * public Ex01(String name) { this.name = name; }
	 */

	public Ex01(String name, int age) {
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
