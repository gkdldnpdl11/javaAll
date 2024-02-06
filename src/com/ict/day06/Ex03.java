package com.ict.day06;

public class Ex03 {
	public static void main(String[] args) {
		// 다중 for문에서 break 와 continue
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i ="+i+", j="+j);
			}
		}
		System.out.println();
		
		// break;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i==2) break;							// i=2 break; => 큰 for문의 출력값 2는 무시된다.
				System.out.println("i ="+i+", j="+j);
			}														// i=1...j=5 , i=3...j=5
		}
		System.out.println();
		
		// break; 
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {				// j=3 break; 
				if (j==3) break;							//  	->   j=3일때 작은 for문 종료 후 큰 for문의 증감식으로 이동
				System.out.println("i ="+i+", j="+j);
			}														// i=1...j=2 , i=2...j=2 , i=3...j=2
		}
		System.out.println();
		
		// continue;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i==2) continue;					// i=2 continue; => 큰 for문의 출력값 2는 출력되지 않는다
				System.out.println("i ="+i+", j="+j);
			}														// i=1...j=5 , i=3...j=5
		}
		System.out.println();
		
		// break; 
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {				
				if (j==3) continue;					// j=3 continue; => 작은 for문의 출력값3은 출력되지 않는다
				System.out.println("i ="+i+", j="+j);
			}														// i=1 : j=3 , i=2 : j=3 , i=3 : j=3은 출력되지 않는다
		}
		System.out.println();
				
	}
}
