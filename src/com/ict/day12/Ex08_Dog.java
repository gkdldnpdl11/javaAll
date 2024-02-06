package com.ict.day12;

// 추상클래스 상속
// 1. 일반적인 클래스가 추상클래스를 상속하면 추상메소드를 오버라이딩해서 구체화한다
class Ex08_Dog extends Ex08_Animal {
	// 부모가 구체화 하지않은 추상메소드를 자식클래스에서 추상메소드를 구체화함
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

 // 2. 추상클래스가 추상클래스를 상속하면 오버라이딩을 하지않아도 된다
 abstract class Ex08_Cat extends Ex08_Animal{
 }

 abstract class Ex08_Cow extends Ex08_Animal {
	@Override
	public void sound() {
		System.out.println("음메");
	}
	public abstract void like();
 }

  abstract class Ex08_chicken extends Ex08_Animal {
	 public abstract void sleep();
 }
  
  class Ex08_My_Animal extends Ex08_chicken {
	@Override
	public void sleep() {
		System.out.println("쿨쿨");
	}

	@Override
	public void sound() {
		System.out.println("꼬꼬댁");
	}
  }
 
  // Cow에서 sound(Ex08_Animal의 추상메소드 해결했기 때문에 Cow에 있는 추상메소드만 해결하면 됨)
  class Ex08_My_Animal2 extends Ex08_Cow {
	@Override
	public void like() {
		System.out.println("누워있기");
	}
  }
  
 