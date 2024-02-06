package com.ict.day03;

public class Ex01 {
	public static void main(String[] args) {
		// 증감 연산자 : 1 증가 또는 1 감소 하는 연산자
		// ++(--) 변수 : 현재 변수가 가지고 있는 값에 1을 증가(감소)하고 나머지를 실행함. 
		// 변수 ++(--) : 현재 변수를 가지고 실행 한 후 그 명령 구문이 끝날때 1을 증가(감소)한다. 
		
		int su1 = 10;
		int su2 = 10;
		System.out.println(++su1); // 1순위로 실행하여 11로 표기
		System.out.println(++su1 +4); // 1순위로 실행하여 16로 표기(이미 11로 실행됨)
		System.out.println(su2++); // 명령구문 종료 후 계산되어 현재는 10으로 표기 그러나 다음줄 부터는 11로 표기된다
		System.out.println(su2++ +4); // 명령구문 종료 후 계산되어 현재는 15으로 표기
		System.out.println(su1); // 12로 표기 (위에서 2번 증가)
		System.out.println(su2); // 12로 표기 (위에서 2번 증가)
		
		// 먼저실행후 반환 =11
		// 먼저 실행후 반환 12+4=16
		// 반환후 실행 10
		// 반환 후 실행 11+4=15
		// 12
		// 12
		
	}
}
