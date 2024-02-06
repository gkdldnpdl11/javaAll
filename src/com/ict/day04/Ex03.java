package com.ict.day04;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 삼항 연산자 : 삼항 연산자 안에 삼항 연산자가 존재
		// 형식) 자료형 변수 = (조건식1) ? ((조건식2) ? 참 : 거짓) : false ;
		// **형식) 자료형 변수 = (조건식1) ? true : ((조건식2) ? true : false ) ;
		
		// int k1= 90 이상이면 "A"학점, 80 이상이면 "B"학점, 나머지는 "F"학점;
		int k1=85;
		String result = (k1>=90) ? "A학점" : ((k1>=80) ? "B학점" : "F학점");
		System.out.println("결과 : "+result);
		
		// char k2가 대문자인지, 대문자가 아닌지, 기타 문자인지 판별하자
		char k2='a';
		String result2 = (k2>='A'&&k2<='Z') ? "대문자" : (k2>='a'&&k2<='z') ? "대문자아님" : "기타문자";
		System.out.println("결과 : "+result2);
		
		// int k3가 1 또는 3이면 남자, 나머지 여자;
		int k3=3;
		String result3 = (k3==1 || k3==3) ? "남자" : "여자";
		System.out.println("결과 : "+result3);
		
		// int k4가 1 또는 3이면 남자, 2 또는 4이면 여자, 나머진 해당없음;
		int k4=5;
		String result4= (k4==1 || k4==3) ? "남자" : (k4==2 || k4==4)? "여자" : "해당없음";
		System.out.println("결과 : "+result4);
		
		
		// 예제 (내가)
		// int k5=8;
		// String result5= (k5==1 || k5==3) ? "남자" : (k5==2 || k5==4) 
		// 														? "여자" : (k5==5||k5==7) 
		//											 				? "외국인 남자" : (k5==6||k5==8)
		//						 									? "외국인 여자" : "해당없음";
		// System.out.println("결과 : "+result5);
		
		
		// int k5가 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자;
		// 			  2이면 1900년대 태어난 여자, 4이면 2000년대 태어난 여자;
		int k5=1;
		String result5= (k5==1||k5==3) ? ((k5==1) ? "1900년생 남자" : "2000년생 남자") : 
			(k5==2||k5==4) ? ((k5==2) ? "1900년생 여자" : "2000년생 여자") : "해당없음";
		System.out.println("결과 : "+result5);
		
		// 두 수 중에 큰 수를 구하라 (=은 의미없음 / 같은 숫자는 어짜피 같은 숫자로 표기됨)
		int su1=4;
		int su2=9;
		int res =(su1>su2) ? su1 : su2;
		System.out.println("결과 : "+res);
		
		int res2=Math.max(su1,su2);  // 큰 값 구하기
		System.out.println(res2);
		
		int res3=Math.min(su1, su2);  // 작은 값 구하기
		System.out.println(res3);
		
		
	}
}
