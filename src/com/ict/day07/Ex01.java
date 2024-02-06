package com.ict.day07;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		esc: while (true) {
			System.out.print("숫자 입력 : ");
			String su = scan.next();
			// 숫자가 아닌 것을 넣으면 오류 발생 (나중에 try~catch 처리)
			int s1 = Integer.parseInt(su);
			String res = "";
			if (s1 % 2 == 0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println(su + "는 " + res + "입니다");

			while (true) {
				System.out.print("계속 할까요 (y/n)");
				String msg = scan.next();
				// String에서는 같다 (==)를 사용하면 안되고 equals()를 사용한다
				// equals()는 대소문자 구별
				// equalsIgnoreCase()는 대소문자를 구별하지 않는다
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				}
				if (msg.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("제대로 입력하세요");
			} 	// 안쪽 while 

		}	// 바깥쪽 while
		System.out.println("수고하셨습니다");
			
	}
}
