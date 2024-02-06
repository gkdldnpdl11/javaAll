package com.ict.day18;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		// 스트림 생성 : 기본 자료형 배열로부터 스트림 생성
		// 					IntStream , DoubleStream, LongStream
		
		// IntStream<T> IntStream.of(Int... values) // 가변 인자
		// IntStream<T> IntStream.of(Int[])
		// IntStream<T> Arrays.stream(Int[])
		// IntStream<T> Arrays.stream(Int[], 시작 index , 끝 index (끝위치 포함X))
		
		Integer integerarr []= {1,2,3,4,5};
		Stream<Integer> inteStream=Arrays.stream(integerarr);
		// 최종처리를 한 후에는 다시 호출할 수 없다
		inteStream.forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		// 다시 사용하려면 다시 Stream 생성해야함
		inteStream=Arrays.stream(integerarr);
		System.out.println(inteStream.count());
		System.out.println();
		
		// Stream<T> : count() 존재 / sum(), average() 존재X
//		inteStream=Arrays.stream(integerarr);
//		System.out.println(inteStream.sum());
//		System.out.println(inteStream.avg());
		
		// 기본 자료형 배열로 스트림 생성
		// IntStream : count(), sum(), average() 전부 사용 가능
		int intArr[]= {10,20,30,40,50};
		IntStream intStream1=IntStream.of(10,20,30,40,50);
		IntStream intStream2=IntStream.of(intArr);
		IntStream intStream3=Arrays.stream(intArr);
		IntStream intStream4=Arrays.stream(intArr, 2,5);
		
		intStream1.forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		System.out.println("총 갯수 : "+intStream2.count());
		System.out.println("총 합계 : "+intStream3.sum());
		System.out.println("평균 : "+intStream4.average());
	}
	
}
