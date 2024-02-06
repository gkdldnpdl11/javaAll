package com.ict.day14;

// Local 내부클래스
public class Ex03 {
	String name="둘리";
	private int age=3;
	
	public Ex03() {
		System.out.println("외부 : "+this);
	}
	
	public void sound() {
		String str="호이호이";
		System.out.println(str);
	}
	
	// 내부클래스를 가지고 있는 메소드 (=외부메소드)
	public void play() {
		int age=147;
		int cnt=10;
		// 메소드 안에 클래스 (=Local)
		class Inner02{
			String addr="서울";		// 전역변수 아님, 지역변수임
			public Inner02() {
				System.out.println("내부 : "+this);
			}
			
			public void like() {
				System.out.println(name);
				// 변수 이름이 동일한 지역변수와 전역변수가 존재. 지역변수가 우선순위라서 지역변수 먼저 사용
				System.out.println(age);
				// 외부클래스의 this와 내부클래스의 this가 다름(주소가 다르기 때문)
				System.out.println(this.addr); 
				
				// 외부클래스의 메소드를 내부클래스 안에서는 사용 가능
				sound();
			}	// 내부메소드 종료
			
			// 내부클래스 안에서 전역변수 호출
			public void A(int k) {
				System.out.println(k);
			}
			
			// 외부클래스의 메소드 사용 불가
			// sound();
			
		}	// 내부클래스 종료
		
		// 먼저 외부메소드를 실행하여 객체 생성할 조건이 만족되어 내부클래스의 객체 생성 가능
		// Ex03_Main에 실행해놓은 play()메소드를 삭제하거나 주석처리 하면 아래에 실행문과 play()의 실행문이 실행하지 않음
		Inner02 inner02 = new Inner02();
		// System.out.println(name);		// 둘리
		// 내부클래스가 종료되었으므로 this 사용시 외부메소드로 이동하기 때문이다. 그러므로 전역변수 사용 가능하다
		// System.out.println(this.age); 	//3
		inner02.like();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		inner02.A(this.age);
		System.out.println(cnt);
	}	// 외부메소드 종료
	
}	// 외부클래스 종료
