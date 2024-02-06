package com.ict.day17;

public class Ex02_Main {
	public static void main(String[] args) {
		Ex02 test=new Ex02();
		new Thread(test, "dog").start();		// 새로운 스레드를 만들고 스레드의 이름 지정
		new Thread(test, "cat").start();
		new Thread(test, "tiger").start();
		new Thread(test, "lion").start();
		
		// Ex02의 run()가 임계영역이 됨 (dog,cat,tiger,lion이 하나의 run()을 가지고 같이 씀)
		
		System.out.println("main : "+Thread.currentThread().getName());
		
		
	}
}
