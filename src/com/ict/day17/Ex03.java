package com.ict.day17;

public class Ex03 implements Runnable {
	int x=0;
	
	// 동기화 처리할 때 현재 실행 중인 스레드를 강제로 대기상태로 변경시키는 메소드는 wait()
	// wait() 를 풀어주는 예약어 notify(), notifyAll()
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
			if (x==11) {
				try {
					wait();			// x=11 일때 빠져나온다
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();			// x=11일때 멈추고 x=12일때 wait() 풀어준다. 풀어주면 wait()는 대기상태로 되돌아감
			}
		}
	}
	
}
