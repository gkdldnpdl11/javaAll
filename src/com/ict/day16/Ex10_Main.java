package com.ict.day16;

// 데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
//						일반 스레드가 종료되면 데몬 스레드는 강제로 종료된다

// 메인메소드가 종료되면 강제종료 시키는 방법

public class Ex10_Main {
	public static void main(String[] args) {
		// 둘 다 데몬을 적용시키면 무한루프(while문 사용)가 종료되는데 하나만 적용시키면 둘 다 무한루프함(확인 필요) 
		Ex10 test=new Ex10();
		Thread thread = new Thread(test);
		thread.setDaemon(true);		// 데몬스레드는 start() 이전에 넣어야함. 데몬스레드를 넣어줌으로써 Ex10에서 돌고있는 무한루프가 종료됨
		thread.start();
		
		Ex11 test2=new Ex11();
		Thread thread2 = new Thread(test2);
		thread2.setDaemon(true);
		thread2.start();
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("수고하셨습니다");			// 데몬스레드를 실행하지않으면 14까지 진행하고 난 뒤에도 Ex10에 실행한 "1111"이 3초마다 계속 출력됨
	}
	
}
