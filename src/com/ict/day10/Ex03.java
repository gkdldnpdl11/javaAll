package com.ict.day10;

public class Ex03 {
	// Overloading(중복정의) : 한 클래스안에서 같은 이름을 가진 메소드가 여러개 정의되어있는것
	//											 반드시 인자의 자료형이나 갯수가 달라야 한다
	
	public double plus(int s1, int s2) {
		double sum=s1+s2;
		return sum;
	}
	
	public double plus(double s1, int s2) {
		double sum=s1+s2;
		return sum;
	}
	
	public double plus(int s1, double s2) {
		double sum=s1+s2;
		return sum;
	}
	
	public double plus(double s1, double s2) {
		// 소수점에 의해서 결과값=1 의 차이가 발생 할 수 있다.
		// int sum=(int)(s1+s2);
		double sum=s1+s2;
		return sum;
	}
	
	public double plus(String s1, String s2) {
		double k1= Double.parseDouble(s1);		//	String 변환
		double k2= Double.parseDouble(s2);
		double sum=k1+k2;
		return sum;
	}
	
	public double plus(String s1, int s2) {
		double k1= Double.parseDouble(s1);		//	String 변환=>double 형변환
		double sum=k1+s2;
		return sum;
	}
	
	public double plus(int s1, String s2) {
		double k1= Double.parseDouble(s2);		//	String 변환=>double 형변환
		// 메소드에서 다른 메소드를 호출할 수 있다
		double sum=plus(s1, k1);
		return sum;
	}
	
}
