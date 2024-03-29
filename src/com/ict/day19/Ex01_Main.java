package com.ict.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex01_Main {
	public static void main(String[] args) {
		Ex01 p1=new Ex01("이순신", 40,100);
		Ex01 p2=new Ex01("김유신", 20,100);
		Ex01 p3=new Ex01("홍길동", 13,50);
		
		List<Ex01>list = new ArrayList<Ex01>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		// 컬렉션으로 처리
		System.out.println("고객명단 순서대로 출력");
		System.out.println("총 비용은 ~~입니다");
		System.out.println("-----나이가 20 이상인 고객의 명단 출력 (입력순)");
		System.out.println("------나이가 20 이상인 고객 명단 출력(오름차순)");
		System.out.println("==========================");
		
		// 스트림으로 처리
		System.out.println("고객명단 순서대로 출력");
		Stream<Ex01> stream = list.stream();
		stream.map(i->i.getName()).forEach(i->System.out.println(i+" 고객님"));
		
		// 위에서 최종처리를 했으므로 다시 stream 만들어 사용
		int sum=list.stream().mapToInt(i->i.getPrice()).sum();
		System.out.println("총 비용은 : " +sum+" 입니다");
		
		System.out.println("-----나이가 20 이상인 고객의 명단 출력 (입력순)");
		// Stream<Ex01> stream2 = list.stream();
		// 원래 쓰던방식인데 같은 변수이름을 사용하고 싶으면 아래처럼 사용해도된다
		stream = list.stream();
		stream.filter(i->i.getAge() >=20).map(i->i.getName()).forEach(i->System.out.println(i));
		
		System.out.println("------나이가 20 이상인 고객 명단 출력(오름차순)");
		stream = list.stream();
		stream.filter(i->i.getAge() >=20).map(i->i.getName()).sorted().forEach(i->System.out.println(i));
	}
	
}
