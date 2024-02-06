package com.ict.day18;

import java.util.stream.IntStream;

public class Ex06 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1,2,3,4,5,1,2,3};
		
		IntStream intStream1 = IntStream.of(arr);
		intStream1.forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		// 중간처리 : distinct() = 중복 제거 
		IntStream intStream2 = IntStream.of(arr);
		// 중간처리 후 최종처리까지 해야함 (forEach)
		intStream2.distinct().forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		// 중간처리 : filter(조건) = 조건에 맞지 않는 요소 제외
		IntStream intStream3 = IntStream.range(0, 10);		// End exclusive : 마지막은 포함X
		// 조건 : 짝수만 출력
		intStream3.filter(i->i%2==0).forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		// 중간처리 : limit(수) = '수'만큼 잘라내기
		IntStream intStream4 = IntStream.rangeClosed(0, 10);		// End inclusive : 마지막까지 포함O
		intStream4.limit(3).forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		// 중간처리 : skip(수) = '수'만큼 제외시킨다
		IntStream intStream5 = IntStream.rangeClosed(0, 10);
		intStream5.skip(3).forEach(i->System.out.print(i+"\t"));
		System.out.println();
		
		
		
		
		
	}
	
}
