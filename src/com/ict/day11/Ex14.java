package com.ict.day11;

public class Ex14 {
	public static void main(String[] args) {
		System.out.println(Ex13.num);
		System.out.println(Ex13.play2());
		System.out.println();
		
		// static은 객체 생성없이 접근 가능하지만 private는 접근 못함
		// System.out.println(Ex13.age);
		
		Ex13 t1=new Ex13();
		System.out.println(t1.su);
		System.out.println(t1.num);
		System.out.println(Ex13.num);
		System.out.println();
		
		Ex13 t2=new Ex13();
		System.out.println(t2.su);
		System.out.println(t2.num);
		System.out.println(Ex13.num);
		System.out.println();
		
		Ex13 t3=new Ex13();
		System.out.println(t3.su);
		System.out.println(t3.num);
		System.out.println(Ex13.num);
		System.out.println();
		
		
		
	}
	
	
}
