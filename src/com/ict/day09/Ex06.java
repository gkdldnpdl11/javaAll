package com.ict.day09;

public class Ex06 {
	String name ="홍길동";			// instance
	static int kor=80;
	static int eng=95;
	static int math=95;
	int total=0;
	
	// static method
	public static void play01() {
		// static은 미리 만들어져있는 것을 사용하는데 'kor+eng+math;'는 만들어지지 않아서 사용불가
		// static method : 전역 변수를 사용하기 위해서는 전역 변수도 static method 이여야 한다
		// 지역 변수에는 static 사용 불가
		int sum =kor+eng+math ;
		
		// System.out.println(name); 						// 전역변수가 instance = 호출 불가
		System.out.println("국어 : "+kor);				// 전역변수가 static = 호출 가능
		System.out.println("총점 : "+sum);				// 지역변수는 method가 만들어질때 사용가능
	}
	
	
	public static int play02() {
		int sum=kor+eng+math;
		return sum;
	}
	
	
}
