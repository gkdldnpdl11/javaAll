package com.ict.day07;

public class Ex03 {
	public static void main(String[] args) {
		// char ch[]; (선언)
		// ch=new char[4]; (생성)
		
		// 선언과 생성을 한번에 (ex : int su=4;)
		char ch[] = new char[4];
		// 초기값 넣기
		ch[0]='J';
		ch[1]='a';
		ch[2]='v';
		ch[3]=65+32; 			// 0~65,535는 char안에 숫자로 저장되기 때문에 사이 값은 형변환을 하지 않아도 char 저장 가능
		
		// for문 사용시 기본적으로 배열의 길이만큼을 적용한다
		// 현재 상태는 char ch[] 배열의 길이만큼만 적용된 상태
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		// 선언과 생성과 초기값 넣기를 한번에
		char ch2[] = {'J','a','v',97};
		int k2[]= {100,200,300,'a'};
		double d2[]= {7.15,7.16,7.0,7};
		
		// 자료형 클래스 이므로 참조 자료형 배열(객체형 배열)
		String[] s1= {"홍길동","이길동","고길동","박길동"};
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		for (int i = 0; i < k2.length; i++) {				// length는 가장 최근의 배열 기준이므로 다른 배열의 결과값을
			System.out.println(k2[i]);						// 								가져오기 위해서는 선언한 값을 넣어야함
		}
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		for (int i = 0; i < d2.length; i++) {			// 실수 선언이므로 정수를 넣어도 실수로 반환
			System.out.println(d2[i]);						// 7 => 7.0 반환
		}
		
		
	}
}
