package com.ict.day16;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		// Queue interface : FIFO (First-In, First-Out)
		//									먼저 들어온 정보가 먼저 나간다
		// 			구현 클래스 : LinkedList (멀티 스레드 동기화 X)
		LinkedList<String> linkedList = new LinkedList<String>();
		// 추가 삽입 :  add, addFirst, addLast, offer, offFirst, offLast
		linkedList.add("고길동");
		linkedList.offer("도우너");
		System.out.println(linkedList);
		
		linkedList.addFirst("둘리");			// 맨 앞에 추가
		System.out.println(linkedList);
		
		linkedList.offerFirst("공실이");	// 맨 앞에 추가
		System.out.println(linkedList);
		
		linkedList.add(2, "마이콜");			// 마이콜 삽입
		System.out.println(linkedList);
		System.out.println();
		
		if (linkedList.contains("마이콜")) {
			System.out.println(linkedList.indexOf("마이콜")+"\t마이콜의 위치값");
			System.out.println(linkedList.get(2)+"\t위치2 반환");
			System.out.println(linkedList.getFirst()+"\t위치0 반환");
			System.out.println(linkedList.getLast()+"\t마지막 위치 반환");
		}
		System.out.println();
		
		// 고길동을 도우너로 변경
		linkedList.set(linkedList.indexOf("고길동"), "도우너");
		//System.out.println(linkedList);
		
		for (String k : linkedList) {
			System.out.println(k+"@");
		}
		System.out.println();
		
		Iterator<String>it=linkedList.iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k);
		}
		
	}
}
