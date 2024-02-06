package test;

import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		int com[]=new int [3];	// 난수 배열크기
		int user[]=new int [3];	// 입력 배열크기
		int strike=0;
		int ball=0;
		int count=0;
		
		for (int i = 0; i < com.length; i++) {
			com[i]=(int)(Math.random()*10);		// 난수 생성
			for (int j = 0; j < com.length; j++) {
				if (com[j]==com[i]) {
					i--;		// 난수 중복 제거
					break;
				}
			}
		}
		
		for (int k : com) {
			System.out.print(k+" ");
		}
		
		esc : while (true) {
			Scanner sc=new Scanner(System.in);
			for (int i = 0; i < user.length; i++) {
				System.out.print("숫자를 입력하세요");
				user[i]=sc.nextInt();
				for (int j = 0; j < i; j++) {
					if (user[j]==user[i]) {
						System.out.println("중복된 값을 입력하였습니다");
						i--;	// 직접입력 중복 제거
						break;
					}
				}
			}
			
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < com.length; j++) {
					if (com[i]==user[j] && i==j) {	// 위치=값
						strike++;
					} else if (com[i]==user[j] && i!=j) { // 값 동일, 위치 다름
						ball++;
					} 
					System.out.println(strike +"s\t"+ball+"b");
					if (strike==3) {
						break esc;
					}
					strike=0;
					ball=0;
				}
			}
			
		}
		System.out.println();
		
	}
}
