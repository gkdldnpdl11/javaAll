package com.ict.day12;

import java.util.Scanner;

public class Ex05_Main {
	public static void main(String[] args) {
		// 다형성 : 하나의 메세지가 각각의 객체마다 자기의 특성에 맞게 반응하는 것
		// 오버로딩 : 한 클래스 안에서 같은 이름의 메소드가 여러개 존재하는 것
		// 				인자의 자료형이나 갯수가 다르다
		// 오버라이딩 : 상속관계에서 부모메소드와 자식메소드가 같은 것
		//						이 때, 자식클래스가 부모클래스의 메소드의 내용을 자식클래스에 맞게 변경해서 사용한다 (재정의)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("선택하세요 (1. 고양이 , 2. 강아지)   >>");
		int su=scan.nextInt();
		
		// 결과는 똑같음
//		if (su == 1) {
//			Ex05_Cat cat = new Ex05_Cat();
//			cat.sound();
//			cat.play();
//		} else if (su == 2) {
//			Ex05_Dog dog = new Ex05_Dog();
//			dog.sound();
//			dog.hobby();
//		}
		
		// 같은 부모클래스를 가진 자식클래스들은 한번에 작성 가능하다.
		// 부모를 선언해서 자식을 사용하는방법임
		Ex05_Animal animal=null;
		if (su==1) {
			animal=new Ex05_Cat();
		} else if (su==2) {
			animal=new Ex05_Dog();
		}
		// 오버라이딩 (부모자식 둘다 가지고 있는 메소드임)
		animal.sound();
		// 부모만 가지고 있는 메소드
		animal.like();
		// 선언을 부모클래스로 하게되면 자식만 가지고 있는 메소드는 사용할 수 없다
		// 자식만 가지고 있는 메소드 (단점) : 사용 할 수 없다 =>따로 객체 생성 후에는 사용 가능
		// 부모만 가지고 있거나 부모자식 둘다 가지고 있으면 사용할 수 있음. 그러나 자식만 가지고 있으면 사용할 수 없다
		//		animal.hobby();
		//		animal.play();
		
	}
}
