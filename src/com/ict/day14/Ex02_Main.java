package com.ict.day14;

// import com.ict.day14.Ex02.Inner01;

public class Ex02_Main {
	public static void main(String[] args) {
		// 1. 멤버 내부클래스는 별도로 객체 생성 불가
		// 1-1. Inner01 t1= new Inner01(); => 내부클래스만 따로 객체 생성 불가
		
		// 2. 외부클래스를 통해서 내부클래스 객체를 생성
		Ex02 t1=new Ex02();
		// 2-1. 외부클래스의 내부클래스를 t2로 선언
		// 2-2. 내부클래스를 새로 객체 생성하여서 상세주소가 다름
		// 2-3. t2 주소에 반드시 $ 가 존재한다 (=$표시가 있으면 내부클래스란 뜻)
		// 2-4. 아직 내부클래스 객체 생성 전이다. 내부클래스 객체 생성을 할 수 있는 준비만 되어있는 상태
		
		Ex02.Inner01 t2= t1.new Inner01();
		// 3. 아래 방식으로 객체 생성을 하게되면 3번줄에 있는 import가 생성되어야 한다
		// 3-1. Inner01 t3= t1.new Inner01();
		System.out.println();
		
		t2.play();
		System.out.println();
		
		// * 멤버 내부클래스에서는 먼저 외부클래스 생성 후 내부클래스 생성
	}
	
}
