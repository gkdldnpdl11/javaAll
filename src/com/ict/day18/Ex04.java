package com.ict.day18;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// 정수배열을 Stream 활용
		int arr[]= {1,2,3,4,5};
		int sumVal=Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count();			// count 반환형이 long = int 형변환
		
		System.out.println("합계 : "+sumVal);
		System.out.println("카운트 : "+count);
	}
	
}
