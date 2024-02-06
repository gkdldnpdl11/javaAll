package com.ict.day04;

public class Ex04 {
	public static void main(String[] args) {
		// 단순 if문 : 조건이 true인 경우에만 실행. false일 경우는 실행되지 않는다.
		// 형식) if(조건식){
		//				조건식이 참일때 실행할 문장;
		//				조건식이 참일때 실행할 문장;
		//				조건식이 참일때 실행할 문장;
		//			  }
		// 주의사항 : 실행할 문장이 한줄이면 {}(블록) 생략가능;
		
		// int k1이 60이 합격(if문의 조건이 맞지않으면 if문은 생략된다/조건이 맞으면 계산식 진행)
		int k1=70;
		String result="초기값"; // 조건이 맞지 않을때 표시되는 수식
		if (k1>=60) {
			result="합격";           // 조건이 맞을때 표시되는 수식
		}
		System.out.println("결과 : "+result);
		System.out.println();
		
		// int k2가 60이상이면 합격, 60미만이면 불합격
		int k2=79;
		String result2="초기값";
		if (k2>=60) {
			result2="합격";
		}
		if (k2<60) {
			result2="불합격";
		}
		System.out.println("k2 : "+result2);
		System.out.println();
				
		// int k3가 60이상이면 합격, 60미만이면 불합격
		int k3=50;
		String result3="불합격";
		if (k3>=60) {
			result3="합격";
		}
		System.out.println("k3 : "+result3);
		System.out.println();
		
		
		
	}
}
