package com.ict.day17;

// 선언에서 FunctionalInterface를 사용해서 오류 확인, 그래야 나중에 호출해서 사용할 때 편함
// 함수형 인터페이스가 하나의 추상메소드만을 가지고 있는지 컴파일러가 확인하는 작업
// 추상메소드가 1개 초과시 오류가 발생한다
@FunctionalInterface
public interface Ex09 {
	int getMax(int num1, int num2);
	// int getMin(int num1, int num2);
}
