package com.ict.day06;

public class Ex05 {
	public static void main(String[] args) {
		// continue와 continue label
		// continue : continue 이하 수행문을 포기하고 해당 for문의 증감식으로 이동
		// continue label : continue 이하 수행문을 포기하고, continue label이 있는 반복문(for문)의 증감식으로 이동
		
		// 1~10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		for (int i = 1; i < 11; i++) {
			if (i==6) continue;					// break와 continue의 차이점은 break는 조건식 초과 무시
			System.out.print(i+"\t");			// continue는 조건식 제외 
		}
		System.out.println();
		
		esc : for (int i = 1; i < 11; i++) {
			if (i==6) continue esc;				// 다중 for문이 아니기 때문에 label을 사용하지 않는다 = 결과값이 동일
			System.out.print(i+"\t");
		}
		System.out.println();
		
		System.out.println("다중 for문에서 continue label 사용");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i ="+i+", j="+j);
			}
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i==2) continue; 							// 작은 for문에서의 증감식 이동
				System.out.println("i ="+i+", j="+j);
			}
		}
		System.out.println();
		
		esc : for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i==2) continue esc; 						// 작은 for문의 증감식 이동이 아닌 큰 for문의 증감식으로 이동
				System.out.println("i ="+i+", j="+j);
			}
		}
		System.out.println();
						
	}
}
