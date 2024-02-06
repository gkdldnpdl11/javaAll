package com.ict.day17;

public class Ex10_Main {
	public static void main(String[] args) {
		String s1="Hello";
		String s2=", Java !";
		// 가장 기본적인 방법
		Ex10_1 t1=new Ex10_1();
		t1.makeString(s1, s2);
		System.out.println();

		// 익명 객체를 생성하는 람다식 처리방법
		Ex10 t2=(k1, k2)-> System.out.println(k1.concat(k2));
		t2.makeString(s1, s2);
		System.out.println();
		
		Ex10 t3=(k1, k2)-> System.out.println(k1+k2);
		t3.makeString(s1, s2);
	}
	
}
