package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		// 3989초 =  ?시간?분?초
		
		// 예시 (내가)
		// int s1=3989;
		// int s2=3600;
		// int s3=60;
		// int result1 = 0;
		// int result2 = 0;
		// int result3 = 0;
		// result1 = s1/s2;
		// result2 = (s1-s2)/s3; // ???????
		// result3 = s1 % s3;
		// System.out.println("결과 : "+result1+"시 "+result2+"분 "+result3+"초 ");
		
		
		// 3989초 =  ?시간?분?초
		
		int total=3989;
		int h=0;
		int m=0;
		int s=0;
		int res=0;   // 나머지 저장
		
		// 시간 계산
		h= total/(60*60);       // 시간
		res=total%(60*60);   // 초에서 시간을 뺀 나머지 값
		m=res/(60);               // 나머지 값에서 분으로 계산
		s=res%(60);               // 나머지 값에서 분을 제외한 나머지 시간(초)
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
				
		int total1=3989;
		int h1=0;
		int m1=0;
		int s1=0;
		int result=0;
		h1=total1/(60*60);
		result=total1%(60*60);
		m1=result/60;
		s1=result%60;
		System.out.println(h1);
		System.out.println(m1);
		System.out.println(s1);
		
	}
}
