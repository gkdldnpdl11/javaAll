package com.ict.day16;

public class Ex08_Main {
	public static void main(String[] args) {
		System.out.println("main : "+Thread.currentThread().getName());
		
		Ex08_TestA testA=new Ex08_TestA();
		Ex08_TestB testB=new Ex08_TestB();
		Ex08_TestC testC=new Ex08_TestC();
		
		// 멀티스레드 실행 시 순차적인 출력이아니라 일처리가 되는 순서대로 출력
		testA.start();		// 스레드(스레드는 start, run로 구성되어 따로 작성X)를 상속받아서 start 사용
		testB.start();
		testC.start();
		
		// 메인메소드가 일 처리하는 분량이 제일 적기 때문에 "수고하셨습니다"가 위에 스레드 출력보다 먼저 출력됨
		System.out.println("수고하셨습니다");
		
	}
}
