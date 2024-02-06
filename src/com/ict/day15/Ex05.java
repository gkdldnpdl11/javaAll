package com.ict.day15;

public class Ex05 {
	public static void main(String[] args) {
		// 6자리 채우기 (중복안됨)
		int arr[]=new int [6];
		
		for (int i = 0; i < 6 ; i++) {
			int su=(int)(Math.random()*10);
			arr[i]=su;			// 난수를 배열에 넣음
			for (int j = 0; j < i ; j++) {
				if (arr[j]==su) {			// arr[j]==arr[i] , arr[j]==su
					i--;							// i=j일때, arr[i] 자리에 새로운 난수를 넣기 위해서
					break;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
	}
}
