package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex10 {
	public static void main(String[] args) {
		List<Integer>numbers = Arrays.asList(10,20,30,40,50);
		Stream<Integer>stream1 = numbers.stream();
		// reduce (수행기능)
		Optional<Integer>sum= stream1.reduce((i,j)->Integer.sum(i, j));
		System.out.println("total : "+sum);
		
		List<Integer>numbers2 = Arrays.asList(10,20,30,40,50);
		Stream<Integer>stream2 = numbers2.stream();
		// reduce (초기값, 수행기능)
		int sum2= stream2.reduce(1000, (i,j)->Integer.sum(i, j));
		System.out.println("total : "+sum2);
		
		int num[]= {10,20,30,40,50};
		IntStream intStream = IntStream.of(num);
		int total=intStream.sum();
		System.out.println("total : "+total);
		
		Stream<Integer>numbers3 =Stream.of(1,2,3,4,5,6,7,8,9,10);
		// reduce 수행기능만 존재할때
		// 누적합과 같음 : 합계 = 이전값+현재값...반복
		Optional<Integer>total2= numbers3.reduce((x,y)->x+y);
		System.out.println("total : "+total2);
	}
	
}
