package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		// if ~else문
		// 삼항 연산자와 비슷하게 처리
		// 즉, 조건식이 true와 false일 때 각각 나눠서 처리한다.
		// 주의사항) 한줄은 블록 생략 가능{};
		// if(조건식){
		//		조건식이 참일때 실행;
		//		조건식이 참일때 실행;
		//		조건식이 참일때 실행;
		//  } else {
		//		조건식이 거짓일때 실행;
		//		조건식이 거짓일때 실행;
		//		조건식이 거짓일때 실행;
		//  }
		
		// int k1이 홀수인지 짝수인지 판별
		// 힌트) 어떤 수를 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
		int k1=2;
		String result="";  // 초기값은 무조건 주는 방식으로
		if (k1%2==0) {
			result="합격";
		} else {
			result="불합격";
		}
		System.out.println("결과 : "+result);
				
		// int k2가 60이상이면 합격 아니면 불합격
		int k2=47;
		String result2="";
		if (k2>=60) {
			result2="합격";
		} else {
			result2="불합격";
		}
		System.out.println("k2는 "+result2+"입니다");
		
		// k3이 1이면 가격에 10% 할인 한다. (얼마에 구매 가능인지?)
		int k3=1;
		int price =1000;
		int res;
		if (k3==1) {
			res=price-(int)(price*0.1);
		} else {
			res=price;	
		}
		System.out.println("가격 : "+res+"원");
		
		// char k4 = 대문자인지 대문자가 아닌지 판별
		char k4='A';
		String result3="";
		if (k4>='A'&&k4<='Z') {
			result3="대문자";
		} else {
			result3="대문자아님";
		}
		System.out.println("결과 : "+result3);
		
		// 근무시간 8시간 까지는 시간당 9860원이고
		// 8시간 초과한 시간만큼은 1.5배 지급
		// 현재 근무시간은 10시간
		// 얼마를 지급해야하는가?
		int time=10;
		int dan=9860;
		int res2;
		int hour=8;
		double pri = 1.5;
		if (time>hour) {
			res2=(int)(dan*pri*(time-hour)+(hour*dan));
		} else {
			res2=time*dan;
		}
		System.out.println("지급액 : "+res2+"원 입니다.");
		
		}
}
