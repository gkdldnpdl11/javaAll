package com.ict.day12;

public class Ex04_Main {
	public static void main(String[] args) {
		// 자식클래스를 객체 생성하면 (생성자 호출) 자식클래스의 부모클래스의 생성자 호출
		Ex04_Game t= new Ex04_Game();
		System.out.println(t.num);
		// 부모의 부모클래스에 있어서 사용 가능
		t.call();			// 전화기능
		t.sms();		// 문자기능
		// 객체 생성한 자식클래스
		t.play();		// 게임하기
		// 자식클래스에는 없지만 부모클래스에 있어서 사용 가능
		t.sound();	// 음악듣기
		System.out.println();
		
		Ex04_DCa t1= new Ex04_DCa();
		// 자식클래스와 부모클래스에서 같이 num를 사용하면 부모클래스의 num은 무시하고 자식클래스의 num으로 반환한다
		System.out.println(t1.num);		//010-7777-9999
		t.call();		// 전화기능
		t.sms();	// 문자기능
		t1.pic();	// 사진찍기기능
		System.out.println();
		
		Ex04_Mp3 t2= new Ex04_Mp3();
		System.out.println(t.num);	//010-7979-9797
		t.call();			// 전화기능
		t.sms();		// 문자기능
		// 음악듣기
		t2.sound();		// t.sound(); 이것도 가능. 자식클래스에게 상속받아서 사용 가능
		System.out.println();
		
	}
	
}
