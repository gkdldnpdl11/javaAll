package com.ict.day07;

public class Ex05 {
	public static void main(String[] args) {
		// String 클래스
		// 	String.getBytes() : byte[]
		// 	String.toCharArray() : char[]
		// 	split (String regex) 				   : String[]
		// 	split (String regex, int limit) : String[]
		
		// 1. String.getBytes() : byte[]
		//			해당 문자열을 byte[]로 변환시킨다.
		//			보통 입출력에 사용함(대문자, 소문자, 숫자 : 영어 이외에는 사용 불가)
		String s1= "java 대한 JAVA";
		byte b1[]=s1.getBytes();
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
		System.out.println();
		
		char c1[]=s1.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			System.out.print(c1[i]);
		}
		System.out.println();
		
		// 2. split(String regex) : String[]
		//		split(String regex, int limit) : String[]
		// 	String regex => 구분자 (나눌 기준)
		//		int limit => 나눌 배열의 크기
		
		String s2="사과, 딸기 망고, 오렌지, 두리안 용과";
		String s3[]= s2.split(",");
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
		System.out.println();
				
		String s4[]=s2.split(" ");
		for (int i = 0; i < s4.length; i++) {
			System.out.println(s4[i]);
		}
		System.out.println();
		
		// 배열공간이 부족하면 마지막 한개의 배열공간에 나머지가 모두 들어간다
		String s5[]= s2.split(" ", 3);					// 배열의 갯수를 3개로 지정
		for (int i = 0; i < s5.length; i++) {		// 갯수를 지정하여 앞에서부터 x,x,x...이 됨
			System.out.println(s5[i]);				// 1=사과, 2=딸기 3=망고, 오렌지, 두리안 용과 
		}
		System.out.println();
		
		// 배열공간을 남게 지정하면 최대한 사용하고 남은 공간은 삭제된다
		String s6[]= s2.split(" ",15);
		for (int i = 0; i < s6.length; i++) {	
			System.out.println(s6[i]+" 먹기");
		}
		System.out.println();
		
	}
}
