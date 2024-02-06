package com.ict.day13;

public class Ex11_Main {
	public static void main(String[] args) {
		toPlay2("홍길동");
		
		// 인터페이스는 객체로 생성 못함
		// Ex11_IBehavior ibe= new Ex11_IBehavior();
		
		// 이게 기본임
		Ex11_Soccer soccer=new Ex11_Soccer();
		toPlay(soccer);
		Ex11_BassGuitar bassGuitar= new Ex11_BassGuitar();
		toPlay(bassGuitar);
		
		// 부모클래스만 사용하면 객체로 생성못함 (인터페이스라서)
		// 부모 클래스와 자식클래스를 사용해서 객체 생성 가능(이렇게 잘 안함)
//		Ex11_IBehavior soccer=new Ex11_Soccer();
//		Ex11_IBehavior bassGuitar= new Ex11_BassGuitar();
		
		// 하나만 가지고 인자를 변경하면서 사용 가능(다형성) : 인터페이스가 같으면 대체가 가능하다
		//	toPlay(bassGuitar);
		
		// anonymous inner type 생성 가능함 
		// toPlay(new Ex11_Soccer());
		// toPlay(new Ex11_BassGuitar());
	}
	// 인터페이스라서 toplay로는 객체 생성을 못함. 객체 생성은 자식클래스로 객체생성하여 인터페이스를 사용하면됨
	public static void toPlay(Ex11_IBehavior ib) {
		ib.play();
	}
	public static void toPlay2(String str) {
		System.out.println(str+"님 성공!");
	}
}
