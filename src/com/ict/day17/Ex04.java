package com.ict.day17;

// 시험문제
// 두개의 스레드를 생성하여 첫번째 스레드의 출력을 1-100
// 두번째 스레드가 출력을 101-200 출력 (synchronized 사용)
public class Ex04 implements Runnable {
	int k=0;
//	@Override
//	public synchronized void run() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println(++k + " : " +Thread.currentThread().getName());
//		}
//	}
	
	// 보통은 잘 안쓰지만 synchronized 블록을 사용하여 할수도 있다
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				System.out.println(++k + " : " +Thread.currentThread().getName());
			}
		}
	}
}
