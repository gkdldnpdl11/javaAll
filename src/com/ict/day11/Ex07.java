package com.ict.day11;

public class Ex07 {
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	int rank = 1;

	public Ex07() {

	}

	// 생성자는 메소드를 호출할 수 있다
	public Ex07(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		// process 메소드를 호출하여 총점, 평균, 학점, 순위까지 한번에 다 가져옴
		process();
	}

	public void process() {
		sum = kor + eng + math; // == sum=k1+k2+k3
		avg = (int) (sum / 3.0 * 10) / 10.0;
		if (avg >= 90) {
			hak = "A";
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg >= 70) {
			hak = "C";
		} else {
			hak = "F";
		}
	}
	
}
