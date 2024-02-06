package com.ict.day13;

// 인터페이스 상속
// 1. 일반 크래스가 상속을 받으면 반드시 오버라이딩 해야 한다
class Ex03 implements Ex02 {
	// 일반 클래스가 인터페이스를 상속받아서 implements 사용
	@Override
	public void sound() {
		
	}
	@Override
	public void play() {
		
	}
}

// 2. 추상클래스가 상속을 받으면 오버라이딩 할 필요가 없다 (객체 생성 X)
abstract class Ex04 implements Ex02 {
	// 추상클래스가 인터페이스를 상속받아서 implements 사용
}

// 3. 인터페이스가 상속을 받으면 오버라이딩 할 필요가 없다 (객체 생성 X)
interface Ex05 extends Ex02 {
	// 인터페이스가 인터페이스를 상속받아서 extents 사용
}
