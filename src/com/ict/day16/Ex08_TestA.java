package com.ict.day16;

// 스레드를 만들어서 처리하려면 상속받아야함

public class Ex08_TestA extends Thread {
	// start와 run이 같이있으면 start로 가기 때문에 결국은 싱글스레드가 됨
//	@Override	
//	public synchronized void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa : "+i+ Thread.currentThread().getName());
//		}
//	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa : "+i+ Thread.currentThread().getName());
		}
	}
}
