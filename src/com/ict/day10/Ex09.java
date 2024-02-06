package com.ict.day10;

public class Ex09 {
	private String name = "";
	private int price = 0;
	
	//  getter/setter
	// 변수의 접근제한자가 private이므로 외부에서는 접근 불가
	// 내부에서는 접근 가능한 부분을 이용하여 
	// 메소드들을 만들어서 접근해서 데이터를 삽입하거나 가져올 수 있다
	
	public void sName(String k) {
		name=k;
	}
	
	public void sPrice (int k) {
		price=k;
	}
	
	public String gName() {
		return name;
	}
	
	public int gPrice() {
		return price;
	}

	
	
//	위에 4개랑 동일한 뜻임
//	public String getName() {
//		return name;
//	}
//	지역변수(받은 데이터)->지역변수(동일한 지역변수)->전역변수 : 데이터저장
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public int getPrice() {
//		return price;
//	}
//	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	
	
	
	
	
}
