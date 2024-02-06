package com.ict.day09;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Ex12 t1= new Ex12();
		t1.play02("홍길동", 100, 84, 78);
		
		System.out.println();
		
		Ex13 t2=new Ex13();
		t2.play02("고길동", 100, 97, 84);
		System.out.println();
		
		// 이름 국어 영어 수학 점수받기
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 : ");
		String name=scan.next();
		System.out.print("국어 : ");
		int kor=scan.nextInt();
		System.out.print("영어 : ");
		int eng=scan.nextInt();
		System.out.print("수학 : ");
		int math=scan.nextInt();
		System.out.println();
		// 호출
		t2.play02(name, kor, eng, math);
		
		scan.close();
	}
}
