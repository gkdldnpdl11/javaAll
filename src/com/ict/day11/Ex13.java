package com.ict.day11;

public class Ex13 {
	// public static class Ex13 = 클래스에 static 사용 불가
	
	// static : 객체 생성과 상관없이 미리 만들어진 필드와 메소드
	//				클래스와 지역변수에는 사용할 수 없다
	// 			모든 객체가 접근해서 사용할 수 있다 (단, private 일 때 사용할 수 없다)
	//				static 영역에 만들어진다
	
	int su=10;
	static int num=10;
	private static int age=42;
	
	public Ex13() {
		su++;
		num++;
	}
	
	public void play() {
		int k = su +1000;
		int k2=num+1000;
	}
	
	// static method = 전역변수 사용 불가
	// 지역변수에 static 사용 불가
	public static int play2() {
		//		int k = su +1000;
		int k2=num+1000;
		//		static int k3=1000;
		return k2;
	}
	
}
