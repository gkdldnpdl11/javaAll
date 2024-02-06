package com.ict.day09;

public class Ex16 {
	public static void main(String[] args) {
		Ex15 t=new Ex15();
		
		String name = t.play01("둘리");
		System.out.println("name : "+name);
		System.out.println(t.name);
		System.out.println();
		
		int res= t.play02(90, 90, 90);
		System.out.println("res : "+res);
		System.out.println(t.sum);				// Ex15 sum 데이터가 저장되어 있지 않기 때문에 반환값=0
		System.out.println();
		
		int res2=t.play03(80, 80, 80);			// Ex15, Ex16 두개의 클래스에 kor80, eng80, math80의 데이터를 저장
		System.out.println("res2 : "+res2);
		System.out.println(t.sum);				// Ex15 sum 데이터에 가격을 저장하여 반환값=240
		
	}
}
