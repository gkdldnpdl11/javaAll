package com.ict.day11;

public class Ex15 {
	// instance : 객체 생성할 때 생성자를 통해서 초기화한다
	
	// static 초기화 (초기값 설정)
	// static 초기화는 블록 기준으로 위에 있어야지 실행 가능하다 (아래에 있으면 실행안함)
	// 단 초기값을 지정하지않고 선언만 했다면 초기화 기준 아래에 있더라도 데이터값(주소값)이 저장된다
	
	/*
	 	static{
	 		초기화 내용;
	 	}
	*/
	
	int s1=100;
	private int p1=300;
	static int s2;			// 50000
	static int s3;			// 0
	
	public static int k2=300;	// 20000
	static int k3=300;				// 300
	private static int k4=5000;
	
	static {
		k2=20000;
		s2=50000;
		j2=40000;
		m2=60000;
	}
	
	static int m2;			// 60000
	static int j2=400;		// 400
	
	
	
	
}
