package com.ict.day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		// ArrayList = Stream
		List<String> sList=new ArrayList<String>();		// 리스트생성
		sList.add("Tomas");				// 리스트 내용 추가
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> Stream = sList.stream();
		Stream.forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		// 중간처리 : 정렬 = sorted() = 오름차순 정렬
		Stream<String> Stream2 = sList.stream();
		// forEach 사용하여 최종처리까지 해야지 종료
		Stream2.sorted().forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		// 내림차순 정렬 : sorted(Comparator.reverseOrder());
		Stream<String> Stream3 = sList.stream();
		Stream3.sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		// 정렬 오름차순 : 숫자 > 대문자 > 소문자 > 한글
		Stream<String>stream4=java.util.stream.Stream.of(new String[] {"bb","a","0","라","CC","3","dd","BB","aaa","가","마"});
		stream4.sorted().forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		// 정렬 내림차순 : 한글 > 소문자 > 대문자 > 숫자
		Stream<String>stream5=java.util.stream.Stream.of(new String[] {"bb","a","0","라","CC","3","dd","BB","aaa","가","마"});
		stream5.sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		// 같은 단어에 대소문자만 다를 때는 먼저 생성된것이 먼저 나온다(reverse() 상관없이) 
		Stream<String>stream6=java.util.stream.Stream.of(new String[] {"bb","a","0","라","CC","3","dd","BB","aaa","가","마"});
		stream6.sorted(String.CASE_INSENSITIVE_ORDER).forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		Stream<String>stream7=java.util.stream.Stream.of(new String[] {"bb","a","0","라","CC","3","dd","BB","aaa","가","마"});
		stream7.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(i->System.out.print(i+"\t"));
		System.out.println();
	}
	
}
