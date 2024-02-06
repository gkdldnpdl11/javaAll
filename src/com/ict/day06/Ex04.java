package com.ict.day06;

public class Ex04 {
	public static void main(String[] args) {
		// break와 break label
		// break : 현재 위치의 블록을 탈출
		// break label : 레이블이 지정한 블록을 탈출
		
		// 레이블 지정 : 반복문 앞에 '레이블이름'을 붙이면 된다.
		
		// 1~10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		// 1~10까지 출력 ( break 사용 )
		for (int i = 1; i < 11; i++) {
			if (i==6) break;									// 6 초과값은 출력되지 않는다 (단순 break;)
			System.out.print(i+"\t");
		}
		System.out.println();
		
		// 1~10까지 출력 ( break label 사용 )
		// 반복문(for,switch,while) 앞에 break label 이름: 을 붙이고 세미콜론( ; ) 
		// for문에는 break label을 붙이 필요가 없다 (break와 break label의 결과값이 동일하기 때문)
		exit : for (int i = 1; i < 11; i++) {					// exit : -> break label 이름
			if (i==6) break exit; 									// break 뒤에 break label 이름을 붙이고 세미콜론으로 종료
			System.out.print(i+"\t");
		}
		System.out.println();
		
		System.out.println("다중 for문 break label 사용하기");

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i ="+i+", j="+j);
			}
		}
		System.out.println();
		
		// break 와 break label의 차이점 : 범위지정
		
		// break;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i==2) break;									// i=2일때 큰 for문은 i=2를 제외한 i=1, i=3을 출력
					System.out.println("i ="+i+", j="+j);
			}
		}
		System.out.println();
		
		// break label;
		exit : for (int i = 1; i < 4; i++) {					
			for (int j = 1; j < 6; j++) {
				if (i==2) break exit;							// i=2일때 큰 for문은 종료
				System.out.println("i ="+i+", j="+j);
			}
		}
		System.out.println();
		
	}
}
