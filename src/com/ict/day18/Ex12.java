package com.ict.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex12 {
	public static void main(String[] args) {
		// Collect : Stream > Collection 변환
		Stream<String>s=Stream.of("a","b","c","b","z");
		// HashSet = 중복안됨, 정렬안됨 / TreeSet = 정렬O 기준은 정하지못함
		HashSet<String>set= s.collect(Collectors.toCollection(()->new HashSet<String>()));
		set.add("h");
		set.add("w");
		System.out.println(set);
		
		// Map
		Stream<String>str=Stream.of("나","우리","너","모두","노래해요");
		// i.length를 이용하여 길이가 같은것끼리 연결해서 그룹으로 묶음 > 묶은걸 컬렉션함
		Map<Integer, String>res01=str.collect(Collectors.groupingBy(i->i.length(), Collectors.joining()));
		System.out.println(res01);
		
		int index []= {1};
		Stream<String>str2=Stream.of("나","우리","너","모두","노래해요");
		Map<Integer, String>res02=str2.collect(Collectors.toMap(i->index[0]++, j->j));	// runtime err
		System.out.println(res02);
		
		str=Stream.of("나","우리","너","모두","노래해요");
		Map<Object, Object>res03=str.collect(Collectors.toMap(i->i, j->j));
		System.out.println(res03);
		System.out.println("---------------------");
		
		// 홀수와 짝수 묶어서 합계 구하기 map 사용해서
		List<Integer>list=Arrays.asList(new Integer[] { 1,2,3,4,5,6,8,11,13,14,15,17,18,19,20 } );
		Map<String, Integer>map=list.stream()
				// 홀수와 짝수를 그룹화(key값)
				.collect(Collectors.groupingBy(i->i%2==0?"even" :"odd" , 
						// 홀수&짝수의 누적합 (value)
						Collectors.reducing(0, (i1, i2)->i1+i2 ) ));
		System.out.println(map);
		
	}
}
