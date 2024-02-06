package com.ict.day14;

// 추상클래스
// 기본방법 (웹에서 많이사용)
abstract class Ex05 {
	int data=1000;
	public abstract void printData();
}

class Ex05_Test extends Ex05{
	@Override
	public void printData() {
		System.out.println("data1 : " +(data+100));
	}
}

class Ex05_Test2{
	// 상속 받지 않고 바로 객체 생성
	Ex05 ex05=new Ex05() {
		@Override
		public void printData() {
			System.out.println("data2 : "+(data+100));
		}
	};
}

class Ex05_Test3{
	// 상속 받지 않고 바로 객체 생성
	public void prn() {
		Ex05 ex05=new Ex05() {
			@Override
			public void printData() {
				System.out.println("data3 : " + (data + 100));
			}
		};		// 내부클래스
		ex05.printData();
	}			// 외부메소드
}				// 외부클래스

// 최종 방법 (앱에서 많이 사용함)
class Ex05_Test4{
	// 상속 받지 않고 바로 객체 생성
	public void prn() {
		new Ex05() {
			@Override
			public void printData() {
				System.out.println("data4 : " + (data + 100));
			}
		}.printData() ; 		// 내부클래스
	}								// 외부메소드
	
}									// 외부클래스
