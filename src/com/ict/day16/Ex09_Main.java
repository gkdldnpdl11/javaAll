package com.ict.day16;

public class Ex09_Main {
	public static void main(String[] args) {
		Ex09_TestA testA=new Ex09_TestA();
		// Runnable 은 start()가 없고 run()만 있기 때문에 상속받을 수 있는게 run()뿐이다. start()를 사용할 수 없다
		// testA.start():
		
		// Thread (Runnable target);
		// Runnable을 상속받은 클래스를 인자로 사용
		Thread t1=new Thread(testA);
		
		// runnable을 가지고있는 Ex09_TestA의 클래스의 run()으로 간다
		t1.start();				//	aaa
		
		// 첫번째방법 (객체 생성하고 선언하는 방식)
		Ex09_TestB testB=new Ex09_TestB();
		Thread t2=new Thread(testB);
		t2.start(); 			// 가가가
		
		// 두번째 방법 : 익명 (객체생성과 동시에 선언)
		new Thread(testB).start();
		
		// 세번째 방법 : (익명 : 안드로이드식)
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("111 : "+Thread.currentThread().getName());
				}
			}
		}).start();		// 이 방식은 start()가 없기때문에 start()를 해야함
		
	}
}
