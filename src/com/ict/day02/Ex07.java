package com.ict.day02;

public class Ex07 {
	public static void main(String[] args) {
		// String : 문자열을 처리하기 위한 클래스이다.
		// 			 기본 자료형은 아님. 참조자료형(클래스를 자료형으로 사용)이다.
		//				 기본 자료형과 사용법이 동일
		//				 데이터에는 반드시 "내용"(쌍따옴표) 사용 ( '' = char , "" = String)
		// 				ex) String 이름 = "내용";
		
		
		// +(더하기)연산자를 사용할 수 있다. (-, *, / 는 사용 불가)
		// 실제로 더하는 것이 아니라 문자열과 문자열을 연결하는 역할을 한다. 
		// + 연산을 하면 무조건 결과는 문자열 (String)이다.
		
		String s1 = "Hello";
		System.out.println(s1);
		
		// 오류 예시
		// String s2 = 10;
		// String s3 = 3.14;
		// String s4 = 'a'
		
		String s5 = "a";
		System.out.println(s5);
		
		String k1 = "1000";
		System.out.println(k1+100);		// 1000100
		
		int k2 = 1000;
		System.out.println(k2+100);		//1100
		
		// 문자열에 + 연산자를 사용하면 무조건 결과는 String이다.
		// ex) int k3 = 105 + "105"; (결과값이 문자열로 나오기 때문에 int로 데이터 변환이 안되어 오류이다)
		String k4 = 105 + "105";		//105105
		System.out.println(k4);
		
		int su1 = 20;
		int su2 = 4;
		System.out.println(su1+su2);		//24
		System.out.println("합계 : " + su1+su2);     // 합계+su1부터 계산되어 문자열이 되기 때문에 (합계 : 20su2 가 되어 -> 합계 : 204)가 된다
		System.out.println("합계 : " + (su1+su2));   // 괄호안의 괄호부터 계산처리 되어 (su1+su2 = 24)가 된 후 (합계 : 24)가 된다.
				
		
	}
}
