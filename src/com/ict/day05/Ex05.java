package com.ict.day05;

public class Ex05 {
	public static void main(String[] args) {
		// while문 : for문과 같은 반복문
		// 형식2)
		// 	초기식 또는 현재 변수
		// 	while (true){
		// 		if (빠져나갈 조건) break; 		// 빠져나갈 조건을 잘 못 쓸 경우 무한루프 실행됨
		//			실행할 내용;
		// 		증감식;
		// 	}
		// * while의 끝을 만나면 조건식으로 이동
		
		// 0~10 까지 출력
		int k1=0;
		while (true) {
			if (k1>=11) break;                  // 빠져나가기 위한 부등호임 -> 0~10까지 출력 후 11부터는 종료
			System.out.println(k1);
			k1++;
		}
		
		System.out.println();
		// 10~20 사이의 짝수만 출력
		int k2=10;
		while (true) {
			if (k2>=21) break;
			if (k2%2==0) {
				System.out.println(k2);
			}
			k2++;
		}
		
		System.out.println();
		// 10~20 사이의 홀수만 출력
		int k3=10;
		while (true) {
			if(k3>=21) break;
			if (k3%2==1) {
				System.out.println(k3);
			}
			k3++;
		}
		
		System.out.println();
		// a~h 까지 출력;
		char c1='a';
		while (c1<'h'+1) {
			System.out.println(c1);
			c1++;
		}
		
		System.out.println();
		char c2='a';
		while (true) {
			if (c2>='h'+1) break;
			System.out.println(c2);
			c2++;
		}
		
		System.out.println();
		
		
		
	}
}
