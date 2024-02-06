package com.ict.day03;

public class Ex03 {
	public static void main(String[] args) {
		// 논리 연산자 : &&(AND , 논리곱, 교집합), || (OR , 논리합 , 합집합), ! (NOT , 논리 부정)
		// 논리 연산자 대상은 boolean형 (비교연산, 논리연산자, 논리형) 
		// 논리 연산자의 결과는 boolean형
		
		// &&(AND , 논리곱, 교집합)
		// 주어진 조건들이 모두 true일 때, 결과는 true이다.
		// 조건들 중에 false을 만나면 결과는 false이다.
		// **false 이후의 연산은 하지 않는다. (이미 false가 나왔기 때문에 결과는 false로 나온다) 
		
		// AND 조건을 이용하면 범위를 지정할 수 있다. (변수가 같아야 범위 지정이 가능하다)
		// a >= 10 && a<=20;
		// a는 10부터 20까지의 범위를 의미한다.
		
		int su1 = 10;
		int su2 = 7;
		boolean res ;
		
		// true = true && true
		res = (su1 >= 7) && (su2 >= 5); // tt
		System.out.println(res);			// true / 1=10, 2=7
		
		// false = true && false
		res = (su1 >= 7) && (su2 <= 5); // tf
		System.out.println(res);			// false / 1=10, 2=7
				
		// false = false && true
		res = (su1 <= 7) && (su2 >= 5); // ft
		System.out.println(res);			// false / 1=10, 2=7
				
		// false = false && false
		res = (su1 <= 7) && (su2 <= 5); //ff
		System.out.println(res);				// false / 1=10, 2=7
		System.out.println();  // 줄 변경
		
		// int su1 = 10, int su2 = 7
		res = ((su1 = su1 + 2) > su2 ) && (su1 == (su2 = su2+5));
		System.out.println("결과 : " + res);   // t
		System.out.println("su1 : " + su1); // 12
		System.out.println("su2 : " + su2);		//12
		System.out.println(); // 줄 변경
		
		su1 = 10;
		su2 = 7;
		// false이기 때문에 뒤 계산식 su2를 계산하지않음. 그러므로 su2는 7이다.
		res = ((su1 = su1 + 2) < su2 ) && (su1 == (su2 = su2+5));  // ((12=10+2)<7) false && 계산x
		System.out.println("결과 : " + res);	// f
		System.out.println("su1 : " + su1);  // 12
		System.out.println("su2 : " + su2);		 // 7
		System.out.println(); // 줄 변경
				
		int su3 = 34;
		// su3같은 20~30 사이의 값이다. (false)
		res = su3 >= 20 && su3 <= 30;
		System.out.println(res);	// f
		
		res = su3 >= 30 && su3 <= 40;
		System.out.println(res);	//t		
		System.out.println();
		
		// char c1이 소문자 이냐?
		char c1 = 'G';
		res = c1 >='a' && c1 <= 'z';
		System.out.println(res);	// f
		
		c1 = 'm';
		res = c1 >='a' && c1 <= 'z';
		System.out.println(res);	// t
		System.out.println();	
		
				
	}
}
