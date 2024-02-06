package com.ict.day10;



// 저장하는 관점 : 변수(하나만 저장) => 배열(여러개 저장 가능, 그러나 같은 자료형만 사용가능) => 클래스(자료형 달라도됨, 여러개 저장 가능)
public class Ex05 {
	String name="";
	int kor=0;
	int eng=0;
	int math=0;
	int sum=0;
	double avg=0.0;
	String hak="";
	int rank=1;
	
	// 1. 총점, 평균, 학점을 구하는 메소드를 구분하여 만들어서 각각 호출 가능 
	// 2. 하나의 메소드에 총점, 평균, 학점을 구할 수 있다
	// 3. 총점, 평균, 학점을 구하는 메소드를 각각 만들어서 총점()=>평균()=>학점()
	
	// 한번에 처리
	public void process(String n, int k1, int k2, int k3) {
		name=n;
		kor=k1;
		eng=k2;
		math=k3;
		sum=kor+eng+math; 		// ==  sum=k1+k2+k3
		avg=(int)(sum/3.0*10)/10.0;
		if (avg>=90) {
			hak="A";
		} else if (avg>=80) {
			hak="B";
		} else if (avg>=70){
			hak="C";
		} else {
			hak="F";
		}
	}
	
}
