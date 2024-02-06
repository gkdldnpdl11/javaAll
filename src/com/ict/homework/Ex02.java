package com.ict.homework;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 가위 바위 보
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int all_count=0;
		int v_count=0;
		
		esc: while (true) {
			System.out.print("1. 가위\t2. 바위\t3. 보");
			int user = scan.nextInt();
			if (user == 1 || user == 2 || user == 3) {
				all_count++;
				int com=ran.nextInt(3)+1;		// 1-3까지
				if (com==1) {
					System.out.println("컴퓨터는 가위");
					if (user==1) {
						System.out.println("무승부");
					} else if (user==2) {
						v_count++;
						System.out.println("승리");
					} else if (user==3) {
						System.out.println("패배");
					}
				} else if (com==2) {
					System.out.println("컴퓨터는 바위");
					if (user==1) {
						System.out.println("패배");
					} else if (user==2) {
						System.out.println("무승부");
					} else if (user==3) {
						v_count++;
						System.out.println("승리");
					}
				} else if (com==3) {
					System.out.println("컴퓨터는 보");
					if (user==1) {
						v_count++;
						System.out.println("승리");
					} else if (user==2) {
						System.out.println("패배");
					} else if (user==3) {
						System.out.println("무승부");
					}
				}
				while (true) {
					System.out.print("계속할까요 ?\t(y/n)");
					String str = scan.next();
					if (str.equalsIgnoreCase("y")) {
						continue esc;
					} else if (str.equalsIgnoreCase("n")) {
						break esc;
					} else {
						System.out.println("다시 선택하세요");
						continue;
					}
				} // 안쪽 while
			} else {
				System.out.println("다시 선택하세요");
				continue esc;
			}
		} // 바깥쪽 while
		System.out.println("전체 횟수 : "+all_count);
		System.out.println("승리 수 : "+v_count);
		System.out.println("승률 : "+(v_count*1.0/all_count)*100+"%");
		
	}
	
}
