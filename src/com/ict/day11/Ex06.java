package com.ict.day11;

public class Ex06 {
	private String name = "";
	private int price = 0;
	
	public Ex06(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void sName(String k) {
		name = k;
	}
	
	public void sPrice(int k) {
		price = k;
	}
	
	public String gName() {
		return name;
	}
	
	public int gPrice() {
		return price;
	}
	
	/*
		위에 4개랑 동일한 뜻임
		public String getName() {
			return name;
		}
		지역변수(받은 데이터)->지역변수(동일한 지역변수)->전역변수 : 데이터저장
		public void setName(String name) {
			this.name = name;
		}
	
		public int getPrice() {
			return price;
		}
	
		public void setPrice(int price) {
			this.price = price;
		}
	*/
	
}
