package com.ict.day14;

import java.util.Scanner;

/*
	throws : 예외 전가, 예외 양도
					예외가 발생하면 예외 처리를 하지 않고, 자신을 호출한 곳으로 예외 객체를 전달한다
					나중에라도 예외 처리 하는것이 좋다
 */

public class Ex11 {
	public void setData(String str) throws NumberFormatException {		// 예외 전가
		// 예외처리
		// try {
			if (str.length()>=1) {
				// 첫 글자 추출 : substring에서 endIndex의 마지막 전까지만 확인한다
				// 문자의 길이는 0부터 시작한다. 1보다 크거나 같으면 최소한 1글자나 숫자 한개 이상을 받았다는 뜻
				// str의 길이가 0보다 크면 (str이 null이 아니면) 
				String res=str.substring(0, 1);
				prnData(res);
			}
		// } catch (NumberFormatException e) {
		//	System.out.println("숫자만 입력하세요");
		// }
	}

	// NumberFormatException 발생하면 해당 메소드를 호출한 곳으로 NumberFormatException를 던진다
	public void prnData(String str) throws NumberFormatException {			// 예외 전가
		// 예외 처리
		// try {
			int dan = Integer.parseInt(str);
			System.out.println(dan + "단");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		// } catch (NumberFormatException e) {
		//	System.out.println("첫글자는 반드시 숫자여야 한다");
		// }
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("정수 입력 : ");
			String msg=scan.next();
			// 클래스 안에 있는 멤버필드나 멤버메소드를 사용하려면 반드시 객체 생성을 해야한다 (static 제외)
			Ex11 ex11=new Ex11();
			ex11.setData(msg);
			
		} catch (NumberFormatException e) {
			System.out.println("제대로 입력하세요");
		}
		System.out.println("수고하셨습니다");
		
	}
}
// throws 는 호출한 객체가 Exception 오류가 발생시 자신을 호출한 곳으로 되돌아가는 역할을 한다
// 호출을 한 메소드에서는 문제해결을 하거나 메소드를 호출한 메소드로 다시 보내거나(throws) 아니면 문제해결을 위해 try~catch 를 사용해서 문제해결 하면된다