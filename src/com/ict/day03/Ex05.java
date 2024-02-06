package com.ict.day03;

public class Ex05 {
	public static void main(String[] args) {
		// 대입 연산자 : 특정 값이나 객체의 주소를 변수에 기억시킬 때 사용
		// ** 변수를 호출하면 변수가 가지고 있는 데이터가 출력된다.
		// a(변수)=b(데이터 또는 변수b) (b는 a에 저장된다)
		// a+=b => a=a+b; 
		// a-=b => a=a-b;
		
		int su1=7;
		su1+=4;   // su1=su1+4; => 오른쪽 계산식을하여 왼쪽 변수에 저장함 (su1=11)
		System.out.println(su1);	//11
		su1-=3;   // su1=11 (위에 계산식에서 su1은 이미 11로 변경됨)
		System.out.println(su1);	//8
		
	}
}
