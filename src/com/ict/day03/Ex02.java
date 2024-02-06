package com.ict.day03;

public class Ex02 {
	public static void main(String[] args) {
		// 비교 연산자 : > , < , >= , <= , ==(같다) , !=(같지 않다)
		// 비교 연산자를 사용할 수 있는 자료형 : 논리형을 제외한 나머지 (문자형(char), 정수형(int), 실수형(double))
		// 비교연산 결과는 논리형이다 (boolean형)
		// 논리형(boolean)은 기본적으로 조건식에 사용된다.
		
		int su1 = 90;
		int su2 = 80;
		// 정수끼리 비교
		boolean result = su1 > su2;
		System.out.println(result);		// true
		
		double su3 = 97.4;	
		double su4 = 89.;
		// 실수끼리 비교
		result = su3>su4;
		System.out.println(result);		// true
		
		// 정수와 실수 비교(정수 실수 비교 가능)
		result = su1 > su4;
		System.out.println(result);		// true
		
		char su5 = 'a';
		char su6 = 'A';
		// 문자끼리 비교
		result = su5 > su6;
		System.out.println(result);		// true 
		
		// 정수와 문자 비교 (정수 문자 비교 가능)
		result = su1 > su5;
		System.out.println(result);		// false / 'a'=97
						
		
	}
}
