package com.ict.day13;

public class Ex10_Main {
	public static void main(String[] args) {
		// 인터페이스는 객체 생성이 안된다
		// Ex06_Add t= new Ex06_Add();
		
		// 추상클래스도 객체 생성이 안된다
		// Ex08_Oper t1= new Ex08_Oper();
		
		// 일반클래스 = 객체 생성 가능 (일반클래스지만 추상클래스와 인터페이스를 상속받아서 수행문 사용 가능)
		Ex09_Calc t3= new Ex09_Calc();
		double res=t3.plus(10, 4);
		System.out.println(res);
		double res2=t3.minus(10,4);
		System.out.println(res2);
		double res3=t3.mul(10, 4);
		System.out.println(res3);
		double res4=t3.div(8,2);
		System.out.println(res4);
	}
	
}
