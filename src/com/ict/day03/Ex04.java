package com.ict.day03;

public class Ex04 {
	public static void main(String[] args) {
		// || (OR, 논리합, 합집합)
		// 주어진 조건들 중에서 하나라도 true이면 결과는 true이다.
		// true를 만나면 이후 연산은 하지 않는다.
		
		int su1 = 10;
		int su2 = 7;
		boolean res;
		
		// true = true || true
		res = (su1 >= 7) || (su2 >= 5);	//t
		System.out.println(res);
		
		// true = true || false
		res = (su1 >= 7) || (su2 <= 5); //t
		System.out.println(res);
		
		// true = false || true
		res = (su1 <= 7) || (su2 >= 5);	//t
		System.out.println(res);
		
		// false = false || false
		res = (su1 <= 7) || (su2 <= 5);	//f
		System.out.println(res);
		System.out.println();
		
		su1 = 10;
		su2 = 7;
		res = ((su1=su1+2)>su2) || (su2==su2+5); // 12=12>7(true) , 7=7+5(false)
		System.out.println("결과 : " + res);	//t
		System.out.println("su1 : " + su1);	//12
		System.out.println("su2 : " + su2); // true 이후로 계산하지 않음 su2 = 7
		System.out.println();
		
		// NOT (! , 논리부정)
		// 주어진 논리값을 반대로 출력한다.
		// true=>false, false=>true
		res = true;
		System.out.println(res);  //t
		System.out.println(!res); //f
		System.out.println(!!res); //t
		System.out.println(!!!res); //f
		
		
	}

}
