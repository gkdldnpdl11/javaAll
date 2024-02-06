package com.ict.day02;

public class Ex03 {
	public static void main(String[] args) {
		// 숫자는 정수형과 실수형으로 나뉘어진다.
		// 정수 : 소수점이 없는 숫자 (1, 2, 3 ...)
		// 실수 : 소수점이 있는 숫자 (0.1, 1.1, 2.1 ...)
		// 정수 < 실수
		// 정수 : byte < short < int(기본) < long
		// 실수 : float < double(기본)
		
		// byte : -128 ~ 127
		byte b1 = 100;
		System.out.println(b1);
		
		b1 = 127;
		System.out.println(b1);
		
		b1 = -128;
		System.out.println(b1);
		
		// ex) b1 = 120+9;
		// 계산 결과가 127을 넘었으므로 오류 발생
		// 즉, 변수에 저장할 때는 결과값으로 저장 유무를 결정한다.
				
		// short : -32,768 ~ 32,767
		// byte처럼 결과값이 범위를 넘으면 사용 불가
		
		// int : 기본적으로 정수를 사용할 때 호출하는 자료형
		int su = 35;
		System.out.println(su);
		
		// long : 정수 중에 가장 큰 범위를 가지고 있음
		//			   즉, 큰 정수를 사용할 때 호출하는 자료형
		//			   숫자 뒤에 L 또는 l 을 붙인다. (생략 가능)
		long num =32L;
		long num2 = -3514L;
		long num3 = 32145l;
		long num4 = -56212l;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		}
}
