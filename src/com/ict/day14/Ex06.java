package com.ict.day14;

// 인터페이스 = static final
interface Ex06 {
	int DATA=1000;
	public void printData();
}

// 정상적인 방법
class Ex06_Test implements Ex06 {
	@Override
	public void printData() {
		int data1= DATA+100;
		System.out.println("DATA1 : "+DATA);
		System.out.println("data1 : "+data1);
	}
}

// 내부클래스를 이용한 방법
class Ex06_Test2 {
	public void prn() {
		new Ex06() {
			int data2=DATA+100;
			@Override
			public void printData() {
				System.out.println("DATA2 : "+DATA);
				System.out.println("data2 : "+data2);
			}	// 내부메소드 종료
		}.printData();	// 내부클래스 종료(실행시킬 메소드를 호출)
	}	// 외부메소드 종료
}	// 외부클래스 종료
