package com.ict.day14;

public class Ex03_Main {
	public static void main(String[] args) {
		// 멤버 내부클래스처럼 객체 생성 할 수 없다
		// Ex03 t1=new Ex03();
		// Ex03.Inner02 t2= t1. new Inner02();
		
		// 별도로 내부클래스를 생성할 수 없다.
		// Inner02 t1=new Inner02();
		
		// 외부메소드 안에 있기 때문에 메소드가 실행되어야 만들 조건이 된다
		Ex03 t1= new Ex03();
		// 외부메소드를 실행 => 내부클래스를 객체 생성 할 수 있는 조건 만족
		t1.play();
		
		
		
		
		
	}
}
