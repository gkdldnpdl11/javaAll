package com.ict.day09;

public class Ex03 {
	public static void main(String[] args) {
		// Math 클래스 주요 메소드
		// 	: 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
		
		// 상수 : E, PI
		System.out.println(Math.E);			// 자연 로그의 밑 값 2.71...
		System.out.println(Math.PI);		// 원주율 3.14....
		
		// 메소드가 모두 static 이다
		// 생성자는 없다 => 객체 생성을 할 수 없다 / Math.메소드() 로 접근 가능
		
		// 1. random() : 0.0 ~ 1.0 미만의 임의의 난수 발생
		System.out.println(Math.random());
		int k1= (int)(Math.random());							
		int k2= (int)(Math.random()*10);						
		// 간단하게 random()뒤에 곱한 숫자값 만큼 발생
		int k3= (int)(Math.random()*3);						
		System.out.println(k1);				// 반환값은 무조건 0
		System.out.println(k2);				// 반환값은 무조건 0~9
		System.out.println(k3);				// 반환값은 무조건 0~2
		
		// 2. ceil() : 올림 /  round() : 반올림 /  floor() : 버림
		System.out.println("ceil : 가장 큰 정수");
		System.out.println(Math.ceil(10.0));				// 10
		System.out.println(Math.ceil(10.1231));			// 11
		System.out.println(Math.ceil(-10.0));				// -10
		System.out.println(Math.ceil(-10.1231));		// -10
		
		System.out.println("floor : 가장 작은 정수");
		System.out.println(Math.floor(10.0));				// 10
		System.out.println(Math.floor(10.984));		// 10
		System.out.println(Math.floor(-10.0));			// -10
		System.out.println(Math.floor(-10.984));		// -11
		
		System.out.println("round : 반올림 (소수점 첫째자리 기준)");
		System.out.println(Math.round(10.0));			// 10
		System.out.println(Math.round(10.4));			// 10
		System.out.println(Math.round(10.5));			// 11
		
		// abs() : 절대값 (양수=>양수, 음수=>양수)
		System.out.println("abs : 절대값");
		System.out.println(Math.abs(10));					// 10
		System.out.println(Math.abs(-10));					// 10
		System.out.println(Math.abs(-10.1231));		// 10.1231
		
		// max(값,값) : 둘 중에 큰값을 구하는 것  /  min(값,값) : 둘 중에 작은값을 구하는것
		System.out.println("max : 큰 값 / min : 작은 값");
		System.out.println(Math.max(15, 15.0009));		// 15.09
		System.out.println(Math.min(15, 15.0009));		// 15.0
		
		// if문 for문 코딩 5문제
		// 클래스 이론에서 5문제 서술형
		// 일일주요에서 나머지 5문제 서술형
		// 총 10 서술 5 코딩
		// 범위는 day08까지
	}
}
