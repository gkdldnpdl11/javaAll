package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가
		// 국어 90점, 영어 80점, 수학 80점이다.
		// 총점과 평균을 구하자.
		// 출력은 이름, 총점, 평균만 출력하자. (단, 평균은 소수점 첫째자리까지 구하자)
		
		
		// 예제 (내가한것)
		// double k1=90;
		// double k2=80;
		// double k3=80;
		// double k4=3;
		// int res = (int) (k1+=k2+=k3); 
		// System.out.println("이름 : 이성훈");
		// System.out.println("총점 : "+res);
		// k1/=k4; // 소수점 첫째자리까지가 안나옴
		// System.out.println("평균 : "+k1);
		
		// 이름이 홍길동인 사람의 점수가
		// 국어 90점, 영어 80점, 수학 80점이다.
		// 총점과 평균을 구하자.
		// 출력은 이름, 총점, 평균만 출력하자. (단, 평균은 소수점 첫째자리까지 구하자)
		
		// 입력 정보
		// 이름 저장
		String name ="홍길동";
		// 국어
		int kor = 90;
		// 영어
		int eng = 80;
		// 수학
		int math =60;
		
		// 요구사항 (처리사항=비즈니스로직) =>입력값으로 원하는 값을 처리하는 방법
		// 총점과 평균
		int sum = kor+eng+math;
		// 정수와 실수가 산술연산을 하면 실수가 된다.
		double avg = (int) (sum/3.0*10)/10.0;    // 실수 = 정수/실수 (소수점 첫번째자리)
		double avg2 = (int) (sum/3.0*100)/100.0;    // 실수 = 정수/실수 (소수점 두번째자리)
		
		// 출력
		System.out.println("이름 : "+name);		// 홍길동
		System.out.println("총점 : "+sum);		// 230
		System.out.println("평균 : "+avg);  // 소수점 첫째자리
		System.out.println("평균 : "+avg2);  // 소수점 둘째자리
		
		// 단위 절하(정수 버림)
		int k1=(198745/10)*10;   // 원단위 절하(5버림)
		System.out.println(k1);
		int k2=(198745/100)*100;  // 십단위 절하(45버림)
		System.out.println(k2);
		
		
		}
}
