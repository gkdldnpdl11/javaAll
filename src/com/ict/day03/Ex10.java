package com.ict.day03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 패키지가 java.lang에 존재하는 클래스를 사용할 때는 import를 할 필요가 없다.
		// java.lang 이외에 존재하는 클래스를 사용하기 위해서는 import를 사용해야 한다.
		// import란 해당 클래스의 위치를 표시하므로 해당 클래스를 사용할 수 있게 한다.
		
		// 키보드에 입력한 정보를 받아서 sacn 변수에 저장	
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		
		// .next() : 입력한 내용을 String(문자열)으로 처리하는 메서드
		String name = scan.next ();
		
		System.out.println("당신의 이름 : " + name);
		
		System.out.print("나이 : " );
		String age = scan.next();
		System.out.println("당신의 나이 : " + (age+1));   // String(문자열)이기 때문에 age1로 출력
		
		// .nextInt() : 입력한 내용을 int(정수형)으로 처리하는 메서드
		System.out.print("나이2 : " );
		int age2 = scan.nextInt();
		System.out.println("당신의 나이2 : " + (age2+1)); // int(정수형)이기 때문에 age2+1로 출력
		
		System.out.print("키 : ");
		// .nextDouble() : 입력한 내용을 double(실수형)으로 처리하는 메서드
		double height = scan.nextDouble();
		// double(실수형)이기 때문에 소수점까지 표기. 정수형으로 작성해도 입력가능
		System.out.println("당신의 키는" + height + "입니다");  
		
		scan.close();
	}
}
