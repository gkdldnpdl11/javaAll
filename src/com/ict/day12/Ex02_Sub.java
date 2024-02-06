package com.ict.day12;

import java.util.Random;

public class Ex02_Sub extends Random{
	int su=0;
	// 랜덤 객체 생성 사용없이 사용가능하다 (상속하여서)
	// 근데 잘 안씀
	public void play() {
		su=nextInt(10)+1; 
		System.out.println(su);
	}
	
	
	
	
}
