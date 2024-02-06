package com.ict.day19;

import java.util.stream.IntStream;

public class Ex04 {
	public static void main(String[] args) {
		// 스레드처리랑 비슷하다고 생각해도됨 / 순차적인 출력이 아니라 무작위출력
		
		// 직접처리는 순차적 반환 0-9
		System.out.println("직접처리");
		IntStream.range(0, 10).forEach(i->System.out.print(i+"\t"));
		System.out.println();
		System.out.println("------------------------------------------------------");
		
		// 병렬처리는 무작위 반환 0-9
		System.out.println("병렬처리");		
		IntStream.range(0, 10).parallel().forEach(i->System.out.print(i+"\t"));
		System.out.println();
		System.out.println("------------------------------------------------------");
		
		// 순차적 누적합 0-10
		System.out.println("직접처리");
		System.out.println(IntStream.rangeClosed(0, 10).sum());
		System.out.println("------------------------------------------------------");
		
		// 무작위 누적합 0-10
		System.out.println("병렬처리");
		System.out.println(IntStream.rangeClosed(0, 10).parallel().sum());
	}
	
}
