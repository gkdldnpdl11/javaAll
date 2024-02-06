package com.ict.day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되며, 화면에서 나라를 물어보면 수도가 출력되는 프로그램 작성
//		Map<String, String> map1 = new HashMap<String, String>();
//		map1.put("대한민국", "서울");
//		map1.put("캐나다", "오타와");
//		map1.put("영국", "런던");
//		map1.put("스위스", "베른");
//
//		Scanner scan = new Scanner(System.in);
//		esc: while (true) {
//			System.out.println("나라를 입력하세요 : ");
//			String msg = scan.next();
//
//			Iterator<String> it = map1.keySet().iterator();
//			while (it.hasNext()) {
//				String k = it.next();
//				if (k.equalsIgnoreCase(msg)) {
//					System.out.println(msg + "=" + map1.get(k));
//				}
//			}
//
//			if (!map1.containsKey(msg)) {
//				System.out.println("데이터에 없습니다");
//			}
//
//			while (true) {
//				System.out.println("계속할까요? (y/n)");
//				String msg2 = scan.next();
//				if (msg2.equalsIgnoreCase("y")) {
//					continue esc;
//				} else if (msg2.equalsIgnoreCase("n")) {
//					break esc;
//				}
//			}
//		}
//		System.out.println("수고하셨습니다");
		
//		Scanner scan=new Scanner(System.in);
//		Map<String, String> map= new HashMap<String, String>();
//		map.put("대한민국", "서울");
//		map.put("캐나다", "오타와");
//		map.put("영국", "런던");
//		map.put("스위스", "베른");
//		
//		Set<String>keys= map.keySet();
//		
//		esc : while (true) {
//			System.out.print("나라 입력 : ");
//			String cty=scan.next();
//			if (keys.contains(cty)) {
//				String res=map.get(cty);
//				System.out.println(cty+"의 수도는 " +res+" 입니다");
//			} else {
//				System.out.println("데이터에 없습니다");
//			}
//			while (true) {
//				System.out.println("계속할까요? (y/n)");
//				String msg=scan.next();
//				if (msg.equalsIgnoreCase("y")) {
//					continue esc;
//				} else if (msg.equalsIgnoreCase("n")) {
//					break esc;
//				} else {
//					System.out.println("제대로 입력하세요");
//					continue;
//				} 
//			}
//		}
		
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되며, 화면에서 나라를 물어보면 수도가 출력되는 프로그램 작성
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("대한민국", "서울");
		map1.put("캐나다", "오타와");
		map1.put("영국", "런던");
		map1.put("스위스", "베른");
		
		Scanner sc=new Scanner(System.in);
		Set<String> key= map1.keySet();
		esc : while (true) {
			System.out.print("nation : ");
			String cty=sc.next();
			if (key.contains(cty)) {
				String res=map1.get(cty);
				System.out.println(cty+"="+res);
			} else {
				System.out.println("데이터 없음");
			}
			while (true) {
				System.out.println("계속할까요? (y/n)");
				String msg=sc.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("제대로입력");
					continue;
				}
			}
		}
		System.out.println("수고");
		
	}
}
