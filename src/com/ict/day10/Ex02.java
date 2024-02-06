package com.ict.day10;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 t= new Ex01();
		int var1=100;
		// 인자가 기본자료형 : Call By Value
		// 값이 변하지 않는다
		int var2=t.add(var1);
		System.out.println("값 : " +var1);		// 100
		System.out.println("값2 : "+var2);	// 101
		System.out.println();
		
		int su []= {1,10,100,1000};
		// 인자가 객체(배열 포함) 자료형 : Call By Reference
		// 참조 되는 값(배열 안의 값)이 변한다
		t.add(su);
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
	}
}
