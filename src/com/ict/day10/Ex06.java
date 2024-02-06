package com.ict.day10;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int su=scan.nextInt();
		// 키보드로 입력받은 학생의 수를 배열로 받는것
		// 학생 수 만큼 배열의 크기를 만들자
		// 해당 배열안에는 클래스가 들어간다
		// Ex05 클래스로 만든 객체를 배열의 자료형으로 사용
		// 즉, 해당 배열 안에는 Ex05로 만든 객체의 주소만 존재한다
		Ex05 arr[]=new Ex05[su];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name=scan.next();
			
			System.out.print("국어 : ");
			int kor=scan.nextInt();
			
			System.out.print("영어 : ");
			int eng=scan.nextInt();
			
			System.out.print("수학 : ");
			int math=scan.nextInt();
			
			// Ex05 클래스가 new로 인해서 새롭게 만들어진다
			// [i]의 숫자만큼 Ex05클래스 자료형(참조변수)이 만들어진다
			// 객체가 생성되고 주소가 만들어진다
			// p의 값 = 객체의 주소값
			Ex05 p=new Ex05();
			p.process(name, kor, eng, math);
			
			// arr[i] = p 주소값
			arr[i]=p;
		}
		
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// 클래스를 객체화 시켰으므로 i, j 동일한 데이터값이다
				// 그러므로 순위를 구할때는 본인과 본인의 데이터를 비교할 필요가 없으므로 continue; 사용
				if (i==j) continue;
				// arr[]에 있는 객체안의 데이터를 비교
				if (arr[i].sum <arr[j].sum) {
					// 객체 안의 데이터를 비교 후 결과값에 따라서 rank 값을 증가시킴
					arr[i].rank++;
				}
			}
		}
		
		// 임시저장 클래스생성
		Ex05 tmp=new Ex05();
		
		// 정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].rank >arr[j].rank) {				// 클래스를 객체화 시킴
					tmp=arr[i];										//	arr[i] = 3개의 클래스 자료형의 주소값 가지고있음 , arr[j] = 클래스 자료형 안의 5개의 데이터의 주소값 가지고있음 
					arr[i]=arr[j];									// arr[i].xxx = arr[i]안에 있는 데이터의 주소값 확인 , arr[j].xxx = arr[j]안에 있는 데이터의 주소값 확인
					arr[j]=tmp;										// 클래스의 주소값을 비교할때는 arr[i]==arr[j]
				}															// 클래스안의 데이터의 주소값을 비교할때는 arr[i].xxx == arr[j].xxx 가 된다
			}
		}
		
		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name+"\t");
			System.out.print(arr[i].sum+"\t");
			System.out.print(arr[i].avg+"\t");
			System.out.print(arr[i].hak+"\t");
			System.out.print(arr[i].rank+"\n");
		}
		
	}
}
