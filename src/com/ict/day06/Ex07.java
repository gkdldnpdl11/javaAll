package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// while 실행한 전체 횟수, 짝수 횟수, 퍼센트(소수점 첫째자리까지)
		int count = 0; // 전체 횟수
		int even = 0; // 짝수 횟수

		esc: while (true) {
			count++;
			System.out.print("숫자 입력 : ");
			int su=scan.nextInt();
			String res="";
			if (su%2==0) {
				even++;
				res="짝수";
			} else {
				res="홀수";
			}
			System.out.println(su+"는"+res+"입니다");
			
			while (true) {
				System.out.print("계속할까요?    1. Yes  ,  2. No    >>>");
				int result=scan.nextInt();
				if (result==1) continue esc;
				if (result==2) break esc;
				System.out.println("다시 입력하세요");
			}
		}
		System.out.println("수고하셨습니다.");
		System.out.println();
		
		double per=even/(count*1.0)*100;
		System.out.println("전체 횟수 : "+count);
		System.out.println("짝수 횟수 : "+even);
		System.out.println("퍼센트 : "+(int)(per*100)/100.0+" %");
		
		scan.close();
	}
}
