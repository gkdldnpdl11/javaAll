package com.ict.day12;

public class Ex05_Cat extends Ex05_Animal {
	int tail=10;
	// 오버로딩은 하나의 클래스안에서 여러가지 메소드를 사용하는것, 오버라이딩은 여러클래스에서 메소드를 가져와서 마음대로 사용하는것
	// 부모메소드를 가져와서 자식클래스가 마음대로 변경할 수 있다
	// 오버라이딩이라고 한다 (Override)
	// @Override = 어노테이션
	// @Override = 부모클래스의 메소드를 자식클래스가 가져와서 재정의(다시 정의)한다
	// 객체를 어떻게만드는지에 따라서 달라진다 => 객체의 다형성(같은 명령어인데 객체마다 반응이 다른것) 
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
	}
	
	public void play() {
		System.out.println("놀기");
	}
	
}
