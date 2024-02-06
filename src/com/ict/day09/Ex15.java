package com.ict.day09;

public class Ex15 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	// 반환형이 있는 메소드
	public String play01 (String k1) {
		name=k1;
		return name;
	}
	// 지역변수 total을 사용하여 객체화 시키지 않으면 사용 불가, 객체화 시켜서 저장위치 생성 후 total의 결과값 저장한 다음에 사용
	public int play02 (int kor, int eng, int math) {
		int total=kor+eng+math;
		return total;
	}
	
	// 전역변수 sum을 사용하여 객체화 시키지 않아도 호출 가능
	public int play03 (int kor, int eng, int math) {
		sum=kor+eng+math;
		return sum;
	}
	
}
