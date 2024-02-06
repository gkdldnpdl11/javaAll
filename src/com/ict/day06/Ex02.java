package com.ict.day06;

public class Ex02 {
	public static void main(String[] args) {
		// break 와 continue
		
		// break : 현재 위치의 블록(for,while,switch)을 탈출할 때 사용하는 예약어
		// continue : continue문 이하 수행문을 포기하고 다음 회차로 진행하는 예약어
		// 					for문의 경우는 증감식으로 이동, while문의 경우는 조건식으로 이동
		//						보통 if문과 함께 사용한다;
		
		// 1~10까지 출력
		// 이스케이프문자 (제어문자)
		//				\n = 줄바꿈
		// 			\t = tab
		// 			\'='
		// 			\"="
		for (int i = 1; i < 11; i++) {
			System.out.print(i+ "\t");
		}		
		System.out.println();
		
		// 1~10까지. 출력 6에서 break 사용
		for (int i = 1; i < 11; i++) {
			if (i==6) break;							// 출력값이 5까지 나옴 (출력값이 계산식 아래에 있기 때문에)
			System.out.print(i+"\t");
		}
		System.out.println();
		
		// 1~10까지. 출력 6에서 break 사용 (잘 사용 안함)
		for (int i = 1; i < 11; i++) {
			System.out.print(i+"\t");
			if (i==6) break;							// 출력값이 6까지 나옴 (출력값이 계산식 아래에 있기 때문에)
		}
		System.out.println();
		
		// 1~10까지. 출력 6에서 continue 사용
		for (int i = 1; i < 11; i++) {
			if(i==6) continue;
			System.out.print(i+"\t");			// i=6일때 아래 수행문이 출력 문자가 6일때 조건식이 동일하여
		}														// 아래 수행문인 출력을 하지않고 증감식으로 이동한다
		System.out.println();
		
		// 1~10까지. 출력 6에서 continue 사용 (의미없음. continue문 아래의 수행문이 없기때문에)
		for (int i = 1; i < 11; i++) {
			System.out.print(i+"\t");			// i=6일때 수행문을 출력
			if(i==6) continue;						// 조건식이 동일하지만 이미 위에서 출력=>증감식으로 이동함
		}
		System.out.println();
		
		// 1~10까지 continue를 이용하여 짝수만 출력
		for (int i = 1; i < 11; i++) {
			if (i%2==1) continue;				// 홀수일 때( if (i%2==1) ) 아래 수행문을 실행하지 않는다 (continue ;)
			System.out.print(i+"\t");
		}
		System.out.println();
		
		// 1~10까지 continue를 이용하여 홀수만 출력
		for (int i = 1; i < 11; i++) {
			if (i%2==0) continue;				// 짝수일 때( if (i%2==0) ) 아래 수행문을 실행하지 않는다 (continue ;)
			System.out.print(i+"\t");
		}
		System.out.println();
		
	}
}
