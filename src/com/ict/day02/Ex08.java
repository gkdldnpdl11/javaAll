package com.ict.day02;

public class Ex08 {
	public static void main(String[] args) {
		// 산술 연산자 : + , - , * , / 
		// 대상 : char, int, long, double, float
		//			  문자형, 정수형, 실수형
		
		int su1 = 9;
		int su2 = 4;
		int result = 0;  // 결과를 저장하는 값
		result = su1 + su2;
		System.out.println("결과 :"+result);		//13
		System.out.println("결과 : 9+4="+result);  	//13
		System.out.println("결과 : su1+su2="+result); 	//13
		// 데이터를 직접 출력하거나 호출하지 말고 변수를 이용하여 출력하거나 호출 하자
		System.out.println("결과 : "+ su1+"+"+su2+"=" +result); //13
		
		result = su1-su2;
		System.out.println("결과 : "+ su1+"-"+su2+"=" +result);	 //5
		
		result = su1*su2;
		System.out.println("결과 : "+ su1+"*"+su2+"=" +result);		//36
		
		// 정수와 정수가 산술연산을 하면 정수가 된다. (과정은 저장하지 않고 결과만 저장하기 때문)
		result = su1/su2;
		System.out.println("결과 : "+ su1+"/"+su2+"=" +result);		//2(정수)
		
		double result2 = su1 / su2;
		System.out.println("결과 : "+ su1+"/"+su2+"=" +result2);		//2.0 (정수로 나눴기지만 저장이 실수이기때문에 2.0)
		
		// 정수와 실수를 산술연산을 하면 결과값은 실수가 된다. (정수+정수=정수 , 실수+실수=실수 , 정수+실수=실수)
		double result3 = su1 / (su2*1.0);
		System.out.println("결과 : "+ su1+"/"+su2+"=" +result3);		//2.25 (정수/실수로 했기때문에 결과도 실수가 됨)
		
		// 나머지 (%)
		result = su1 % su2;
		System.out.println("결과 : "+ su1+"%"+su2+"=" +result);	// 1
		
						
		
	}
}
