package com.ict.day11;

import java.util.Random;

public class Ex17 {
	public static void main(String[] args) {
		// random 처리
		// 1. Math.randon() => method , Random 클래스
		// 	1) Math 전체 메소드가 static 이므로 객체 생성이 없다
		// 	2) Math.method([인자])
		// 	3) Math.random() => 0.0~1.0미만
		System.out.println(Math.random()); 		// 0.0~1.0미만

		// 특정 범위 : (int)(Math.random()*숫자) = 0~(숫자-1)
		System.out.println((int) (Math.random() * 5)); 		// 0~4까지 임의의 난수 발생

		// 2. Random 클래스
		// static이 아니라서 객체 생성
		Random ran = new Random();

		// 각종 자료형의 난수 발생 : 자료형 범위 안에서 난수 발생
		System.out.println("boolean형 : " + ran.nextBoolean());
		System.out.println("int형 : " + ran.nextInt());
		System.out.println("long형 : " + ran.nextLong());
		// 0.0~1.0 미만 = Math.random();
		System.out.println("float형 : " + ran.nextFloat());
		System.out.println("double형 : " + ran.nextDouble());

		// 특정 범위 안에서 난수 발생 : 0 ~ 지정 범위 전까지 난수 발생 (정수)
		// 1. nextInt(범위) : 0~ 지정 범위 전까지의 난수 발생
		// 2. (int)(nextDouble()*지정 범위); = Math.random()*숫자;
		System.out.println(ran.nextInt(7)); 		// 0~6까지 (지정범위 전까지 이므로 6까지임)
		System.out.println((int) (ran.nextDouble() * 7)); 		// 0~6 (int로 형변환 시켰기 때문에 double 사용이여도 정수로 반환)
		
	}
	
}
