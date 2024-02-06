package com.ict.day09;

public class Ex04 {
	// 다양한 형태의 정보를 클래스에 저장할 수 있다
	// 인스턴스 멤버 필드
	String name="홍길동";
	int kor=80;
	int eng=95;
	int math=85;
	int total=0;
	
	// 메소드() : 동작, 기능
	//		** 해당 메소드를 호출하면 실행 후 호출한 곳으로 되돌아 간다
	// 메소드 형식 : [접근제한자] [메소드 종류] 반환형 메소드 이름([인자]) {실행할 내용}
	//						일반 메소드는 메소드종류를 생략한다
	// 					접근제한자는 일반적으로 public 을 사용한다
	// 					** 반환형 : 호출한 곳으로 되돌아갈때 가지고 가는 데이터의 자료형
	//										데이터가 없는 경우는 void 예약어 사용 ( ex) public static viod 메소드이름([인자]){실행내용} )
	// 					반환형이 있는 메소드 맨 마지막 줄에는 return 예약어를 반드시 사용해야 한다
	
	
	// 인스턴스 멤버 메소드
	// 전역 변수에 저장
	// 반환형은 전역변수에 저장해야지 사용할 수 있다
	public void play01() {
		// System.out.println(2);
		total=kor+eng+math;
		// System.out.println(3);
	}
	
	// 지역 변수에 저장
	// {} 안에서만 사용
	public void play02() {
		int sum= kor+eng+math;
	}
	
	// 되돌아갈때(return) 반환형 자료형은 동일하게 int(double=double)를 사용 (값을 보낸다)
	// void가 아닌 반환형은 반드시 return을 사용
	public int play03() {
		int sum=kor+eng+math;
		return sum ;							// 되돌아가는 데이터가 sum이 된다
	}
	
	public int play04 () {
		total = kor+eng+math;
		return total;							//	되돌아가는 데이터는 실제값이나 변수를 사용하면 됨
	}
	
	
	
	
}
