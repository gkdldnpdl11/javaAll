package com.ict.day10;

public class Ex12 {
	public static void main(String[] args) {
		Ex11 t=new Ex11();
		// 변경 전 이름
		System.out.println(t.getName());
		// 홍길동 이름 -> 둘리 변경 (setter)
		t.setName("둘리");
		System.out.println(t.getName());
		// 변경 전 나이
		System.out.println(t.getAge());
		// 둘리 나이 -> 15000살
		t.setAge(15000);
		System.out.println(t.getAge());
		
	}
}
