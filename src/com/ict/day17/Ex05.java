package com.ict.day17;

// 두개의 스레드를 생성하여 첫번째 스레드의 출력 1-50
// 두번째 스레드의 출력 51-100
// 다시 첫번째 스레드가 101-150
// 다시 두번째 스레드가 151-200 출력 (synchronized 사용)
public class Ex05 implements Runnable {
	int k = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(++k + " : " + Thread.currentThread().getName());
//			if (k == 50 || k==100) {
			if (k%50==0) {				// 조건이 늘어나도 50에서 떨어지면 종료함 (공통점을 찾아내서 나머지를 0으로 떨어트린다) 
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
		}
	}

}
