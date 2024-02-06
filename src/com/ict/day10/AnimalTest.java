package com.ict.day10;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal=new Animal();
		System.out.println("이름 : " +animal.getName());
		System.out.println("나이 : " + animal.getAge()+"살");
		if (animal.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("죽어있음");
		}
		System.out.println();
				
		// 이름을 펭귄으로 변경
		animal.setName("펭귄");
		
		System.out.println("이름 : " +animal.getName());
		System.out.println("나이 : " + animal.getAge()+"살");
		if (animal.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("죽어있음");
		}
		System.out.println();
		
		// 객체 새로 생성함
		Animal animal2=new Animal();
		// 객체를 새로 생성함으로써 이름은 큰뿔소 반환
		System.out.println("이름 : " +animal2.getName());
		System.out.println("나이 : " + animal2.getAge()+"살");
		if (animal2.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("죽어있음");
		}
		System.out.println();
		
	}
}
