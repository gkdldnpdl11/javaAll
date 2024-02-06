package com.ict.day12;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		// Random
		Random ran= new Random();
		int su= ran.nextInt(10)+1; 	// 1~10
		System.out.println(su);
		// 랜덤 객체를 생성하여 사용
	}
	
}
