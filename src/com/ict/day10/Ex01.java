package com.ict.day10;

public class Ex01 {
	// 메소드 인자를 기본 자료형의 값은 인자로 전달하면 값 호출(Call By Value)
	// 원본(전달) 값은 변하지 않는다
	public int add(int k) {
		++k;
		return k;
	}
	
	// int k = 위에는 기본자료형 아래는 객체형으로 바꾸었기 때문에 같은 메소드 이름을 사용해도 오류가 없다
	
	// 메소드 인자를 배열이나 객체로 인자로 전달하면 참조 호출(Call By Reference)
	// 원본(전달) 값이 변한다
	public void add(int [] k) {
		// 받은 배열을 하나씩 꺼내서 10씩 증가
		for (int i = 0; i < k.length; i++) {
			k[i] = k[i]+10;			// k[i]+=10; (대입연산자 사용)
		}
	}
	
}
