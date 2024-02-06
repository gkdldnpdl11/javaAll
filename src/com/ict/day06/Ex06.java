package com.ict.day06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		esc: while (true) {
			// 숫자를 받아서 홀수인지 짝수인지 출력
			System.out.print("숫자 입력 : ");
			int k1 = scan.nextInt();
			String res = "";
			if (k1 % 2 == 0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println("결과 : " + res);
			while (true) {
				System.out.print("계속할까요 ?  (1. Yes , 2. No     >>>)");
				int k2 = scan.nextInt();
				if (k2 == 1)
					continue esc; 			// 조건이 참이면 작은 while 레이블 종료->큰 while로 이동한다
				if (k2 == 2)
					break esc; 					// 조건이 참이면 큰 while까지 같이 종료한다. 
														// 정수가 아닌 다른 언어를 입력하면 작은 while안에서 무한루프 돈다(오류)
				System.out.println("제대로 입력하세요");
			}											 // 작은 while
		} 												// 큰 while
		System.out.println("수고하셨습니다.");

		
		scan.close();
	}
}
