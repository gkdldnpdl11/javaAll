package com.ict.day13;

public class Ex01_Main {
	public static void main(String[] args) {
		// 일반 클래스에서 static 호출
		System.out.println(Ex01.su2);
		System.out.println(Ex01.SU4);
		System.out.println();
		// 인터페이스에서 호출(인터페이스는 전부 static final=호출 가능)
		System.out.println(Ex02.su1);
		System.out.println(Ex02.su2);
		System.out.println(Ex02.su3);
		System.out.println(Ex02.su4);
		System.out.println();
		
	}
}
