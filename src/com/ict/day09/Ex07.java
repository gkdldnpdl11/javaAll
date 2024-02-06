package com.ict.day09;

public class Ex07 {
	public static void main(String[] args) {
		// static : 객체 생성과 상관없이 호출 가능
		// 호출 방법 : 클래스이름.멤버필드 or 클래스이름.멤버메소드
		System.out.println(Ex06.kor);
		System.out.println(Ex06.eng);
		System.out.println(Ex06.math);
		
		// 메소드도 같음
		Ex06.play01();					// void를 사용하여 데이터는 없지만 반환은 가능하다
		int k=Ex06.play02 ();		// 메소드 형식이 int형 = int형으로 결과값을 return 받았기 때문에 저장위치 생성해야함
		System.out.println(k);
		
	}
}
