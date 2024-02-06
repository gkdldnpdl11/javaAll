package com.ict.day05;

public class Ex02 {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리한다.
		// 			조건식이 참 일때 실행, 거짓이면 실행하지 않는다.
		
		// 형식) for(초기식; 조건식; 증감식){
		//					조건식이 참일때 실행할 문장;
		//					조건식이 참일때 실행할 문장;
		//				}
		
		// 1. for문을 만나면 초기식으로 간다.
		// 2. 초기식 가지고 조건식으로 간다.
		// 3. 조건식이 참이면 실행, 거짓이면 실행하지 않는다.
		// 4. 참 일때 조건식을 실행하다가 블록(for문의 끝)이 종료되면 다시 증감식으로 간다.
		// 5. 증감식에서 증가하거나 감소 후 다시 조건식으로 간다.
		// 6. 조건식에서 참이면 실행, 거짓이면 실행하지 않는다.
		// 위의 3~6번이 거짓이 도출될 때 까지 반복 실행한다.
		
		// 자바에서는 블록 안에서 변수를 만들고 선언하면 해당 블록에서만 사용 가능하다.
		// 해당 블록을 벗어나면  변수는 사라진다.
		// for문의 초기식에서 변수를 만들어 사용한다.
		// 초기식에서 만든 변수는 for문을 종료하면 for문 밖에서는 사용불가 (for문 안에서만 사용가능)
		
		for (int i = 0; i < 10; i++) {					// 처음 계산 종료 후 재실행할때 1이 된다(i++이기 때문에)
			System.out.println(i);							// int i의 값은 반복실행할 때마다 변경 된다
			System.out.println("hi");					// 이 계산식에서 0부터 실행하여 9까지 계산함(10번)
			System.out.println("안녕하세요");		
		}
		// for문에서 만든 변수는 for문 밖에서 사용 불가
		// System.out.println(i);
		
		int k1;
		for (k1 = 0; k1 < 10; k1++) {		// for문 종료(블록끝)후 변수값은 증감식으로 이동하고
			System.out.println("hi");		// 증감식으로 이동한 변수값은 10이 된다.
		}													// 9까지 반복실행 후 종료 => 증감식 이동되어 k1의 값은 10
		System.out.println(k1);				// k1=10이 되었으므로 출력값은 10
		System.out.println();
		
		// 10~20 출력
		System.out.println("10~20까지 출력");
		for (int i = 10; i < 21; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		// 10~20까지 짝수만 출력 
		System.out.println("10~20까지 사이의 짝수만 출력");
		for (int i = 10; i < 21 ; i=i+2) {
			System.out.println(i);
		}
		System.out.println();
		
		// 10~20까지 홀수만 출력
		System.out.println("10~20까지 사이의 홀수만 출력");
		for (int i = 11; i < 20 ; i=i+2) {
			System.out.println(i);
		}
		System.out.println();
		
		// 10~20까지 짝수만 출력
		System.out.println("10~20까지 사이의 짝수만 출력");
		for (int i = 10; i < 21; i++) {
			if(i%2==0) {											// 정수 계산 후 : % = 나머지값
					System.out.println(i);
			}
		}
		System.out.println();
		
		// 10~20까지 홀수만 출력
		System.out.println("10~20까지 사이의 홀수만 출력");
			for (int i = 10; i < 21; i++) {
		// if (i%2!=0) 이것도 가능		
				if (i%2==1) {
					System.out.println(i);
				}
			}
		System.out.println();
		
		// 구구단 5단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("5 * " +i+"="+ (5*i));    // i는 1~9까지 증가, 5단을 구하기 때문에
		}
		System.out.println();
		
		// 0 0 0 0 을 한개(한줄)로 보는 방법
		for (int i = 1; i < 5; i++) {
			System.out.println("0 0 0 0");				// 0 0 0 0이란 출력을 1~5까지(4번) 반복해서 출력함
		}
		System.out.println();
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
		// 4의 배수일 때
			if (i%4==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		// 0~10의 누적합 (누적 합계 구하기)
		int sum=0;									// 이전 값을 기억시키는 변수
		for (int i = 0; i < 11; i++) {		// 0~10까지의 값
			sum=sum+i;							// 0~10까지를 더한 값       // 기억값 = 이전 기억값+현재값 
															//	(ex) 0+1+2+3=6 => 0+1=1 => 1+2=3 => 3+3=6
		}
		System.out.println("누적합 : "+sum);
		System.out.println();
		
		// 0~10 짝수의 합계를 구하자(내가)
		// int sum1=0;
		// 	for (int i = 0; i < 11; i++) {
		//			if (i%2==0) {
		//			sum1=sum1+i;						// 0+2+4+6+8+10
		//		}
		//	}
		//	System.out.println("짝수의 합계 : "+sum1);
		//	System.out.println();
		
		// 0~10 홀수의 합계를 구하자(내가)
		//	int sum2=0;
		//		for (int i = 0; i < 11; i++) {
		//			if (i%2==1) {
		//			sum2=sum2+i;					// 1+3+5+7+9
		//		}
		//	}
		//	System.out.println("홀수의 합계 : "+sum2);
		//	System.out.println();
		
		// 0~10 홀수의 합계, 짝수의 합계 각각 도출
		int even=0;				// 짝수의 합계 저장
		int odd=0;				// 홀수의 합계 저장
		
		for (int i = 0; i < 11; i++) {
			if (i%2==0) {
				even=even+i;
			} else {
				odd=odd+i;
			}
		}
		System.out.println("짝수의 합은 "+even);
		System.out.println("홀수의 합은 "+odd);
		System.out.println();
				
		// 7! (7*6*5*4*3*2*1)의 곱하기의 합은?
		int mul=1;
		for (int i = 7; i > 0; i--) {
			mul=mul*i;							//	누적값=이전값*현재값;
		}
		System.out.println(mul);
		System.out.println();
		
		// 1+(-2)+3+(-4)+...과 같은식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오
		
		
		
	}
}
