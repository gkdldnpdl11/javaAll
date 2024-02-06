package com.ict.day17;

public class Ex09_Main {
	public static void main(String[] args) {
		// 두 수 중 큰 수를 리턴하는 코딩 구현
		Ex09 t1= new Ex09() {
			@Override
			public int getMax(int num1, int num2) {
				int k;
				if (num1 > num2) {
					k=num1;
				} else {
					k=num2;
				}
				return k;
			}
		};
		
		// 이 방법을 좀 더 많이씀
		Ex09 t2= new Ex09() {
			@Override
			public int getMax(int num1, int num2) {
				if (num1 > num2) {
					return num1;
				} else {
					return num2;
				}
			}
		};
		
		// 가장 보편적으로 인터페이스를 객체 생성하여 사용하는 방법
		System.out.println(t1.getMax(100, 200));
		System.out.println(t2.getMax(200, 100));
		System.out.println();
		
		// 오버라이딩을 람다식으로 변경하여 적용
		// 함수형 인터페이스 일 때 사용한다. 
		// 추상메소드가 1개일때 사용함. 2개일때는 못함)
		Ex09 t3= (int num1, int num2)->{
			if(num1>num2) {
				return num1;
			} else {
				return num2;
			}
		};
		
		// FM방식
		System.out.println(t3.getMax(5000, 1000));
		System.out.println();
		
		// 람다식 축약 (추상메소드가 1개일때만 가능함)
		Ex09 t4= (num1,num2)-> num1 > num2 ? num1 : num2;
		System.out.println(t4.getMax(1000, 4000));
		System.out.println();
	}
	
}
