package com.ict.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Book {
	private String name;
	private int price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public class LibraryTest {
		public static void main(String[] args) {
			List<Book> bookList = new ArrayList<Book>();
			bookList.add(new Book("자바", 25000));
			bookList.add(new Book("파이썬", 15000));
			bookList.add(new Book("안드로이드", 30000));

			// 스트림 생성 및 출력
			System.out.println("스트림 생성");
			Stream<Book> stream = bookList.stream();
			stream.map(i -> i.getName()).forEach(i -> System.out.println(i + "\t"));
			System.out.println("---------------------------------");

			// 모든 책의 가격의 합
			int sum = bookList.stream().mapToInt(i -> i.getPrice()).sum();
			System.out.println("모든 책의 가격의 합 : " + sum + "원");
			System.out.println("---------------------------------");

			// 책 가격>=20000, 책 이름 정렬 후 출력
			System.out.println("20,000원 이상의 책 이름 정렬");
			stream = bookList.stream();
			stream.filter(i -> i.getPrice() >= 20000).map(i -> i.getName()).sorted()
					.forEach(i -> System.out.println("책 이름은 " + i + " 입니다"));
		}
	}
	
}
