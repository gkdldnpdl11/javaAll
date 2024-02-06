package com.ict.day04;

public class Ex01 {
	public static void main(String[] args) {
		// 삼항 연산자
		// 형식) 자료형 변수 = (조건식) ? true에 실행할 문장 : false에 실행할 문장;
		
		// int k1이 홀수인지 짝수인지 판별하자.
		// hint) 어떤 수를 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
		
		int k1=16;
		int res=k1%2;
		
		// 자료형 변수 = (res==1) ? "홀수" : "짝수";  (res는 1이 아니면 나머지는"짝수"에 포함된다).
		String result = (res==0) ? "짝수" : "홀수";
		System.out.println(k1+" : "+result);	//짝
		
		result = (k1%2==0)?"짝수":"홀수";
		System.out.println(k1+" : "+result); // 짝
		
		// int k2가 60이상이면 합격 아니면 불합격
		int k2=57;
		result = (k2>=60) ? "합격":"불합격";		
		System.out.println(k2+" : "+result);		// 불
		
		// k3가 1이면 가격의 10% 할인 한다. (얼마에 살 수 있나)
		int k3=1;
		int price = 1000;
		int res2 = (k3==1) ? price - (int) (price*0.1) : price;  //정수*실수 연산이므로 int 적용
		// int res2=(k3==1)? prcie-(price/10) : prcie;    (정수/정수 연산이므로 int 미적용)
		// int res2=(k3==1)? (int)(prcie*0.9) : prcie;       (x*실수 연산이므로 int 적용)
		System.out.println("결과 : "+res2);		//900
		
		// char k4 = 대문자인지, 대문자가 아닌지 판별하자
		char k4='a';
		result = (k4 >= 'A' && k4 <= 'Z') ? "대문자" : "대문자아님";
		System.out.println("결과 : "+result);		//no
		
		// 근무시간이 8시간 까지는 시간당 9860원이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		int time=10;
		int dan = 9860;
		int res3= (time>8)? (int)(dan*1.5*(time-8))+(8*dan) : (time*dan);
		System.out.println("결과 : "+res3); 	//(9860*8)+(9860*1.5)*(10-8)
		
	}
}
