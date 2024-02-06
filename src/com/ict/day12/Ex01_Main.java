package com.ict.day12;

public class Ex01_Main {
	public static void main(String[] args) {
		// 자식클래스를 객체 생성하면 부모클래스가 먼저 만들어지고 그 다음에 자식클래스가 만들어진다
		Ex01_Sub t=new Ex01_Sub();
		System.out.println(t);
		// 생성자 주소가 반환되므로 객체 생성이 되었다는 뜻임
		// 접근 주소가 전부 다 동일함 (부모클래스의 주소를 자식클래스가 상속받기 때문)
		System.out.println();

		t.play();	// 정상적인 방법
		System.out.println();
		// 부모클래스의 멤버필드가 private가 아닐시 접근 가능
		System.out.println(t.addr);			// 자식클래스에 사용하지 않아 부모클래스에서 검색하여 호출
		System.out.println(t.age);			// 자식클래스에서 사용하여 1순위로 자식클래스에 검색하여 호출함
		
		// static : 객체, 상속 등과 상관없이 그냥 호출 가능
		// 클래스이름.멤버필드 , 클래스이름.멤버메소드
		System.out.println(Ex01_Sup.car);					// static
		System.out.println(Ex01_Sup.GENDER);		// static final
	}
	
}
