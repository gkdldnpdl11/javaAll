package com.ict.day17;

public class Ex06_Producer implements Runnable {
	private Ex06_Car car;
	
	public Ex06_Producer(Ex06_Car car) {
		this.car=car;
	}
	
	@Override
	public void run() {
		String carName=null;
		for (int i = 0; i < 20; i++) {
			// getCar에 있는 리스트 중에 하나를 가져온다
			carName=car.getCar();
			// getCar를 받아서 차 이름을 생성(차 생성)
			// carName을 순서대로 받기위해서 synchronized 사용
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*400));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
