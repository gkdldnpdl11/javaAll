package com.ict.day16;

	// 스레드(일꾼) : 현재 실행중인 프로그램 내에서 실행되는 세부 작업 단위
	// 싱글 스레드 : 스레드가 하나, 일단은 1명
	// 멀티 스레드 : 스레드가 여러개, 일꾼도 _여러개 
	// 1. Thread 스레드 : start(), run()
	// 2. Runnable : 인터페이스 상속 : run()만 존재(추상메소드) =>Override 한다

	// 스레드 생산자 : Thread(), Thread(Runnable 인터페이스를 상속받은 객체)
	//							Thread(스레드이름), Thread(Runnable 인터페이스를 상속받은 객체, 스레드이름)

public class Ex07 {
	
	public void play() {
		System.out.println("2 : "+Thread.currentThread().getName());
	}
	public void start() {
		System.out.println("4 : "+Thread.currentThread().getName());
	}
	
		public static void main(String[] args) {
			// 현재 사용중인 스레드의 이름 구하기
			System.out.println("1 : "+Thread.currentThread().getName());
			
			Ex07 test = new Ex07();
			test.play();
			System.out.println("3 : "+Thread.currentThread().getName());
			
			test.start();
			System.out.println("5 : "+Thread.currentThread().getName());
			System.out.println("수고하셨습니다");
			
		}
}
