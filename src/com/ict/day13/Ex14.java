package com.ict.day13;

enum Type2{
	WALK("워킹화",250),
	RUN("러닝화", 255),
	TRACK("트래킹화",265),
	HIK("하이킹화",275);
	
	private final String name;
	private final int size;
	
	// getter만 생성 (반환을 위해서)
	// enum = 상수로 이루어져 있기 때문에 값을 변하게 하는 setter는 필요없음
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	
	// 생성자 역할을 하는 것(기본적으로 private 사용)
	private Type2 (String name, int size) {
		this.name= name;
		this.size = size;
	}

}

public class Ex14 {
	public static void main(String[] args) {
		Type2 arr[]=Type2.values();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+" : "+arr[i].getSize());
		}
	}
}

