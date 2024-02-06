package com.ict.day17;

public class Ex06_Customer implements Runnable{
	private Ex06_Car car;

	public Ex06_Customer(Ex06_Car car) {
		// 구매할 car를 받는것
		this.car=car;
	}
	
	@Override
	public void run() {
		String carName=null;
		for (int i = 0; i < 20; i++) {
			// carList 사이즈가 0 판매 불가
			carName=car.pop();
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
