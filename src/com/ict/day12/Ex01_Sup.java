package com.ict.day12;

	// 부모클래스
	// 항상 상속에서는 부모클래스가 먼저 만들어진다

public class Ex01_Sup {
	String name="홍길동";
	int age=57;
	String addr="서울 방학동";
	private String dog="댕댕이";
	static int car=1;
	static final boolean GENDER=true;
	
	// 객체 안에서 객체 자신을 지칭하는것 = this
	public Ex01_Sup() {
		System.out.println("부모 생성자 : "+ this);
	}
	
}
