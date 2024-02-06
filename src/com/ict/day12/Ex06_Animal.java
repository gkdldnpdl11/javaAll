package com.ict.day12;

public class Ex06_Animal {
	// final 변수 = 데이터 변경 방지 = 상수
	// final method() = Override 방지
	// final class = 상속 방지 (자식클래스 생성 금지)
	
	int age=2;
	final int MONTH=2;
	public void sound() {
		System.out.println("울음 소리");
	}
	
	public final void sleep() {
		System.out.println("15시간 이상 잠을 잔다");
	}
	
}
