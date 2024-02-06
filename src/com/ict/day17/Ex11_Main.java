package com.ict.day17;

public class Ex11_Main {
	public static void main(String[] args) {
		Ex11 t= s ->System.out.println(s);
		
		t.showString("Hello lamda_1");
		
		// static method 는 static method 만 호출 할 수 있다.
		showMyString(t);			// 매개변수의 자료형을 인터페이스로 만든 것

		showMyString(new Ex11() {
			@Override
			public void showString(String str) {
				System.out.println("Hello lamda_3");
			}
		});
	}

	public static void showMyString(Ex11 k) {
		k.showString("Hello lamda_2");
	}

}
