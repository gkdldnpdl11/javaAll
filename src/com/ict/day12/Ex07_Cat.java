package com.ict.day12;

public class Ex07_Cat extends Ex07_Animal {
	int id=124123;
	
	public Ex07_Cat() {
		// super(); : 생략되어 있다
		// super : 부모클래스의 주소를 참조 (부모클래스.멤버 에 접근할 때 사용)
		// super([인자]) : 부모클래스의 생성자
		// 부모생성자 자식생성자에서 둘다 인자가 없을 시에는 super() 없어도됨
		// 부모생성자에서 인자가 있을때는 자식생성자도 인자를 넣어야함
		// 기본적으로 *첫째줄에는 super or this 생략되어있는것임
		super("짜오", 3);
		System.out.println("자식 생성자");
	}
	
	// 모든 자식클래스는 부모클래스의 생성자를 참조해야한다
	// 부모생성자는 String, int로 만들어져있으므로 생성자를 맞춰줘야 오류가 없어진다
	public Ex07_Cat(String name) {
		// super([인자]) 와 this([인자]) 는 둘 다 첫번째 줄에만 사용 가능
		// 즉, 둘중에 하나만 사용 가능하다
		super(name, 7);
		// this();
	}
	
	public Ex07_Cat(int age) {
		// 첫번째 Ex07_Cat에게 가는것
		// 첫번째 Ex07_Cat에는 부모에게가는 super()가 있기 때문에 오류가 없다
		this();
	}
	
}
