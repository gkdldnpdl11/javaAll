package com.ict.day17;

import java.util.ArrayList;
import java.util.List;

// 동기화를 이용한 생산자와 판매자

public class Ex06_Car {
	// 차를 판매할때 사용하는 리스트
	// 판매할 차를 가지고 있는 공간
	private List<String> carList = null;
	
	// 객체를 생성하면 carList 컬렉션 생성
	// 생산한 차량을 집어넣을 컬렉션을 생성한것임
	public Ex06_Car() {
		carList = new ArrayList<String>();
	}
	
	// 해당 메소드를 실행하면 carName 반환
	// 차 생산
	public String getCar() {
		String carName = null;
		switch ((int) (Math.random() * 3)) {		// 0-2까지
		case 0:carName = "SM5";break;
		case 1:carName = "매그너스";break;
		case 2:carName = "카렌스";break;
		}
		return carName;
	}

	public synchronized String pop() {
		String carName=null;
		// carList의 크기가 0이면 (판매할 수 있는 크기가 없으면) wait()
		if(carList.size() ==0) {
			try {
				System.out.println("차가 없습니다. 생산할 때 까지 기다리세요.");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// carList가 가지고 있는 것 중에 맨 마지막에 있는 것 삭제(판매된 것)
		// 가장 최신 생산분을 가지고온다
		carName=(String) carList.remove(carList.size()-1);
		System.out.println("손님이 차를 사갔습니다. 구입한 차 이름은 : \""+carName+"\"입니다.");
		return carName;
	}
	
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 완성되었습니다. 차 이름은 : \""+car+"\"입니다.");
		if (carList.size()==5) {
			this.notify();
		}
	}
	
}