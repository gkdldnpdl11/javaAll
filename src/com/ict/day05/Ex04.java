package com.ict.day05;

public class Ex04 {
	public static void main(String[] args) {
		// while문 : for문과 같은 반복문
		// 형식1)
		// 	초기식 또는 현재 변수
		//		while(조건식){
		//				조건식이 참일때 실행;
		//				조건식이 참일때 실행;
		//				증감식;
		//		}
		// * while 끝을 만나면 조건식으로 이동
		
		// 0~10 출력
		int k1=0;
		while (k1<11) {						// 조건식 = k1의 값은 0부터 10까지
			System.out.println(k1);		// 출력
			k1++;									// 증감식
		}
		
		System.out.println();
		// 10~20까지 짝수만 출력
		int k2=10;
		while (k2<21) {
			if (k2%2==0) {
				System.out.println(k2);
			}
			k2++;
		}
		
		System.out.println();
		// 구구단 7단 출력
		int k3=1;
		while (k3<10) {
			System.out.println("7 * "+k3+"="+(7*k3));
			k3++;
		}
		
		
	}
}
