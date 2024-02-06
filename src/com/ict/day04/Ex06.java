package com.ict.day04;

public class Ex06 {
	public static void main(String[] args) {
		// 다중 if문
		// 형식) if(조건식1) {
		// 				조건식1이 참일 때 실행;
		// 				조건식1이 참일 때 실행;
		// 		} else if(조건식2) {
		// 				조건식1에는 거짓이면서, 조건식2에는 참일때 실행;
		// 				조건식1에는 거짓이면서, 조건식2에는 참일때 실행;
		// 		} else if(조건식3) {
		//					조건식1,2에는 거짓이면서, 조건식3에는 참일때 실행;
		// 				조건식1,2에는 거짓이면서, 조건식3에는 참일때 실행;
		//			}else {
		//					조건식 1,2,3이 모두 거짓인 경우 실행; 
		//					(1,2,3을 제외한 모든 나머지 값)
		//			}
		
		// int k1의 점수가 90이상=A학점, 80이상=B학점, 70이상=C학점, 나머지=F학점
		int k1=89;
		String res;
		if (k1>=90) {
			res= "A학점";
		} else if (k1>=80) {
			res="B학점";
		} else if (k1>=70) {
			res="C학점";
		} else {	
			res="F학점";
		}
		System.out.println("결과1 : "+res);
		
		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		char k2 = 'M';
		String res2 ;
		if (k2>='A'&&k2<='Z') {
			res2="대문자";
		} else if (k2>='a'&&k2<='z') {
			res2="소문자";
		} else if (k2>='0' && k2<='9') { 
			res2="숫자";	
		} else {
			res2="기타문자";
		} 
		System.out.println("결과2 : "+res2);
		
		// char k3가 A 이거나 a이면 아프리카 ,B 이거나 b이면 브라질, C이거나 c이면 캐나다, 나머지 한국
		char k3='g';
		String res3;
		if (k3=='A' || k3=='a') {
			res3="아프리카";
		} else if (k3=='B' || k3=='b') {
			res3="브라질";
		} else if (k3=='C' || k3=='c') {
			res3="캐나다";
		} else {
			res3="한국";
		}
		System.out.println("결과3 : "+res3);
		System.out.println();
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일주스 3500이다.
		// 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가? (단 부가세 10% 포함, 친구와 같은 음료만 선택 가능)
		int menu=4;
		int input=10000;
		int su=2;
		int price=0;
		int total=0;
		int vat=0;
		int output=0;
		String drink="";
		if (menu==1) {
			drink="카페모카";
			price=3500;
		} else if (menu==2) {
			drink="카페라떼";
			price=4000;
		} else if (menu==3) {
			drink="아메리카노";
			price=3000;
		} else if (menu==4) {
			drink="과일주스";
			price=3500;
		} 
		// 단가*수량;
		total = price*su;
		// 부가세;
		vat=(int)(total*0.1);
		//잔돈 계산;
		output = input-(total+vat);
		System.out.println("선택 메뉴 : "+drink);
		System.out.println("지불 금액 : "+input+"원");
		System.out.println("음료 단가 : "+price+"원");
		System.out.println("음료 개수 : "+su+"개");
		System.out.println("총 금액 : "+ (total+vat)+"원");
		System.out.println("잔 돈 : "+output+"원");
		
	}
}
