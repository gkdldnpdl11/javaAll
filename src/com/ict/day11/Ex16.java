package com.ict.day11;

public class Ex16 {
	public static void main(String[] args) {
		System.out.println(Ex15.s2);	// 50000
		System.out.println(Ex15.s3);	// 0 (초기값 지정도 안하고 static 초기화도 안해서 정해진 주소값이 없음(=데이터가 없음))
		
		System.out.println(Ex15.k2);	// 20000
		System.out.println(Ex15.k3);	// 300
		
		// private 라서 오류발생 -> 주석처리
		// System.out.println(Ex15.k4);
		
		System.out.println(Ex15.m2);	// 60000
		System.out.println(Ex15.j2);		// 400
		
	}
	
}
