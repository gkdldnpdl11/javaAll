package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복 불가, 특정 기준으로 정렬 불가
		//			단, TreeSet은 항상 오름차순 유지
		// 		주머니 구조 라고 생각하자
		// 형식) HashSet<제네릭=객체타입=클래스> 참조변수 = new HashSet<[제네릭]>();
		// 			TreeSet<제네릭=객체타입=클래스> 참조변수 = new TreeSet<[제네릭]>();
		
		// 1. 컬렉션 생성
		// 기본자료형은 사용할 수 없다. 
		// HashSet<E> h1=new HashSet<E>();
		
		HashSet<Integer> h1=new HashSet<>();					// Integer 로 만들어진 객체
		HashSet<Double> h2=new HashSet<Double>();
		TreeSet<String> h3=new TreeSet<String>();
		TreeSet<Character> h4=new TreeSet<Character>();
		
		// 2. 컬렉션에 객체 넣기 ( add(E e) )
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("20");
		
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		// int => Integer => 오토박싱 : 기본 자료형을 객체로 변경 (Wrapper 클래스)
		h1.add(50);	
		// 바로 String을 사용할 수 없음
		// h1.add("60");
		System.out.println(h1.add(10));		// 기존에 있는 10이 있기때문에(중복 불가) false = 들어가는 것을 실패했다는 뜻
		System.out.println(h1);
		
		// 일반 for문을 사용할 수 없다
		// for (int i = 0; i < h1.size(); i++) {
		//	System.out.println(h1[i]);
		// }
		
		// 개선된 for문 사용 가능
		for (Integer k : h1) { 							// h1이 가지고 있는 객체가 반복적으로 나와 k에 저장된다 / colon : 처음부터 끝까지 라는 뜻
			System.out.println(k+1000);		// int를 했지만 언박싱으로 인해서 계산가능
		}
		System.out.println();
		
		Iterator<Integer> it= h1.iterator();		// h1이 가지고 있는 객체에 순서대로 접근할 수 있는 it
		while (it.hasNext()) {		// 값이 있는지 없는지 확인 하고(hasNext)
			int s = it.next();			// 값을 꺼낸다 (next)
			System.out.println(s+5000);
		}
		
		// HashSet<Double> h2=new HashSet<Double>();
		h2.add(10.0);
		h2.add(21.5);
		// h2.add(10);			// 객체이기때문에 크기의 비교가 없다 (오류)
		
		// 기본자료형이기 때문에 데이터 크기 비교가 가능하여 작은 자료형이 큰 자료형으로 포함 가능하다
		double d1=3.1;
		double d2=10;
		
	}
}
