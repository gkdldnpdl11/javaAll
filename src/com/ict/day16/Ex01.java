package com.ict.day16;

import java.util.Iterator;
import java.util.Stack;


/*
 	List 인터페이스 : 배열과 흡사한 구조
 							삽입, 삭제, 추가 자유롭다
 							크기를 미리 지정하지 않아도 됨
 	List interface 구현 클래스 : Stack, Vector, ArrayList
 									구조 : LIFO (Last-In, First-Out)
 											마지막에 들어온 데이터가 먼저 나가는 형태
 		add, push, addElement : 추가 (무조건 뒤에 붙는것, 위치값 없음)
 		add(Index, E)					: 삽입
 		pop									: 맨 위에 존재하는 객체 반환 삭제한다 (꺼내서 삭제, 삭제 처리 자체는 객체 내에서 실행)
 		peek								: 맨 위에 존재하는 객체 반환 삭제하지 않는다 (꺼내기만함)
 		contains (Element e) : boolean => 포함되어있는지 확인(T/F)
 		search								: 검색 (오른쪽 1부터) => 리스트형식
 		** indexOf						: 검색 (왼쪽 0부터) => 배열형식처럼
 		elementAt (index) 			: 해당 요소 반환 (위치값의 element 반환)
 		** get (index)					: 해당 요소 반환
 		firstElement()					: 맨 처음 요소 반환
 		lastElement()					: 맨 마지막 요소 반환
 		setElement(Element, Index) : index 위치의 요소 치환
 		
 */


public class Ex01 {
	public static void main(String[] args) {
		Stack<String> s1=new Stack<String>();
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		
		s1.add(1, "고길동");		// index=0 부터 시작
		s1.add(3, "희동이");
		System.out.println(s1);
		System.out.println();
		
		// 마지막 객체 보기 : pop(삭제), peek, lastElement
		String res=s1.peek();
		System.out.println("가지고 온 객체 : " +res);
		System.out.println(s1);
		System.out.println();
		
		// 꺼내서 삭제 처리
		res=s1.pop();
		System.out.println("가지고 온 객체 : " +res);	// pop 사용해서 확인
		System.out.println(s1);									// 확인한 데이터를 모여있는 객체 내에서 삭제
		System.out.println();
		
		res=s1.lastElement();
		System.out.println("가지고 온 객체 : " +res);
		System.out.println(s1);	
		System.out.println();
		
		if (s1.contains("둘리")) {
			System.out.println(s1.indexOf("둘리"));		// 오른쪽으로, 0부터 시작 = 0
			System.out.println(s1.search("둘리"));			// 왼쪽으로, 1부터 시작 = 4
			// 위치값을 이용해서 Element 구하기
			System.out.println(s1.get(1));						// index, 0부터 시작 = 고길동
			System.out.println(s1.elementAt(1));			// index, 0부터 시작 = 고길동
			// 처음, 마지막 요소 반환
			System.out.println(s1.firstElement());			// 처음 = 둘리
			System.out.println(s1.lastElement());			// 마지막 = 희동이
		} else {
			System.out.println("존재하지 않습니다");
		}
		System.out.println();
		
		// 치환 (고길동을 도우너로 변경)
		if (s1.contains("고길동")) {			// String 있는지 확인
			s1.setElementAt("도우너", s1.indexOf("고길동"));	// 고길동의 위치값을 찾기위해 contains 사용
		}
		System.out.println(s1);
		System.out.println();
		
		// 중복가능 (Set,Map 빼고는 중복가능)
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		System.out.println(s1);
		System.out.println(s1.size());		// size=갯수 (index 아님)
		System.out.println();
		
		// 하나씩 꺼내기
		for (String k : s1) {
			System.out.println(k+"님 !!!");
		}
		System.out.println();
		
		Iterator<String> it= s1.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str+"짱 @");
		}
		System.out.println();
		
		// 하나씩 꺼냄 (LIFO)
		while (! s1.isEmpty()) {
			String k=s1.pop();
			System.out.println(k+", 크기는 " +s1.size() + "이다");
		}
		
	}
}
