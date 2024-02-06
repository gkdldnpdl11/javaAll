package com.ict.day14;

// static 내부클래스
public class Ex04 {
	String name="홍길동";
	private int age=24;
	static int cnt=14;
	
	public void play() {
		int money=10000;
		System.out.println("외부 메소드 : "+money);
	}
	// static은 static만 가져올 수 있다 (=인스턴스는 가져올 수 없다)
	public static void like() {
		System.out.println("like");
	}
	
	// 내부클래스 멤버에서 static이 있으므로 내부클래스에 static을 사용
	public static class Inner03{
		String addr="서울 마포구";
		// 내부클래스의 멤버 중에 static 존재
		static int room=5;
		
		public void prn() {
			// static 클래스 : 외부클래스의 "인스턴스" 사용 불가
			// System.out.println(name);
			// System.out.println(age);
			System.out.println(addr);
			System.out.println(room);
			System.out.println(cnt);
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			// play();
			like();
		}	// 내부메소드 종료
	}	// 내부클래스 종료
	
}	// 외부클래스 종료
