package com.ict.day13;

// 인터페이스 : 서비스를 제공하는 목록
// 					상수와 추상메서드로 구성되어 있다(기본임)
//						생성자가 없음(객체 생성 안됨)
//						** 상속과 달리 인터페이스는 하나의 클래스가 둘 이상의 인터페이스를 동시에 구현 할 수 있다
//						인터페이스가 같다라는 뜻은 대체(호환)가 가능하다는 뜻 (다형성)
// 					java 8버전부터 지원 : 1) static method 추가, 2)default method(완전한 메소드) 추가 (나중에)

 class Ex01 {
	int su1=10;
	static int su2=20;
	final int SU3=30;
	static final int SU4=40;
}
 
 interface Ex02{
	 // 원래는 변수명을 대문자 사용
	 // 인터페이스에서는 변수를 만들어도 상수로 강제변환시킴
	 // 전역변수로 생성해도 무조건 static final로 변경 => static final은 생략할 수 있다
	int su1=10;
	static int su2=20;
	final int su3=30;
	static final int su4=40;
	
	// 일반 메소드는 사용 불가
	// public void like() {}
	
	// 인터페이스에서는 abstract 생략 가능
	public abstract void sound();
	public void play();
	
 }
 
 
 
 