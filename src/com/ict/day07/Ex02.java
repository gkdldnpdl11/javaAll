package com.ict.day07;

public class Ex02 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		// 			** 같은 자료형이여야 한다.
		//				생성할 때 크기를 지정해야 한다 (지정하지 않으면 생성되지 않는다)
		//				한번 지정한 크기는 변경되지 않음
		//				배열 안에 데이터를 가져오기 위해서는 일반적으로 for문을 사용
		
		// 배열 생성 순서 : 선언 => 생성 => 초기화(데이터 저장)
		// 1. 선언 : 자료형 이름 []; 또는 자료형 []이름;
		int su[];		// int []su; => 가능
		
		// 2. 생성 : 이름 = new 자료형[배열크기=갯수];
		// 		new 예약어 : 메모리에 데이터를 저장할 공간을 만든다
		//								=> 인스턴스, 객체 생성
		su=new int[4];			// int형 배열 안에 4개의 인스턴스 생성 : [0],[1],[2],[3] 생성됨
		
		// 3. 데이터 저장 : 이름[index=위치값=0부터 시작함]
		//							데이터는 같은 자료형이여야 한다 (프로모션 가능 : 작은 자료형이 큰 자료형으로 변경)
		//																									int => double
		
		su[0]=100;
		su[1]='a';		// 프로모션
		// su[2]=3.14;
		su[2]=(int)(3.14); 		// 디모션(강제 형변환) 실수를 정수로 변환하여 결과값은 3이된다.
		su[3]=100;
		// 배열 크기보다 크면 실행할 때 오류 발생(run time err)
		// su[4]=107;				// index는 0부터 시작하기 때문에 0~3번까지 생성되며 4번은 생성되지 않는다
		
		// 배열 호출 하면 주소(생성 ID)가 출력
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println();
			
		su[2]=107;					// su는 변수가 아니지만 su[2]는 변수이기때문에 다시 저장하면 마지막 저장값을 기억함
		System.out.println(su[2]);
		System.out.println();
		
		
		// 배열을 출력할 때는 보통 for문 사용
		for (int i = 0; i < su.length; i++) {			// 배열(su).길이(length); 0부터 배열의 끝까지 불러온다
			System.out.println(su[i]);
		}
		
	}
}
