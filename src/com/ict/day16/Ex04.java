package com.ict.day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		// Map interface : Key와 Value를 1:1 매핑하는 구조
		//								Key는 중복 불가능
		//								Value 중복 가능
		// 							Key 호출하면 Value 나옴
		//								Key 별도관리 => KeySet()
		//								add() 로 추가 불가능
		// 							put(Key, Value) 로 추가
		//			관련 클래스 : HashMap
		
		// Key가 숫자인 경우 (거의안씀, 대부분 (문자,문자) 사용)
		HashMap<Integer, String> map1= new HashMap<Integer, String>();
		map1.put(0,"한국");		// 키값과 벨류값이 묶여서 같이 나옴
		map1.put(1,"중국");
		map1.put(2,"미국");
		map1.put(3,"태국");
		map1.put(10,"영국");
		map1.put(13,"일본");
		System.out.println(map1);
		System.out.println();
		
		// Key 중복 (덮어쓰기 가능, Key=중복 불가능(밀어내기, 덮어쓰기함))
		map1.put(1,"호주");
		// Value 중복 (상관없음, Value=중복 가능)
		map1.put(16,"한국");
		System.out.println(map1);
		System.out.println();
		
		// 꺼내기, 무조건 KeySet() 사용해야함
		for (Integer k : map1.keySet()) {			// Key의 자료형을 넣어줘야한다 (현재 map1의 자료형 Integer)
			System.out.println(map1.get(k));	// Key를 호출하면 Value가 나옴
		}
		System.out.println();
		
		Iterator<Integer> it= map1.keySet().iterator();
		while (it.hasNext()) {
			Integer k = it.next();
			System.out.println(map1.get(k));		// Key 호출 => Value 반환
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// value 구하기 (거의안씀 : key 값을 모르면 불러올 수 없어서. value 내용에 대한 검사만 가능하다)
		Collection<String>var= map1.values();
		System.out.println(var);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// entrySet() : Key, Value 모두 필요한 경우 (key, value 동시에 구하기 때문에 key 값을 알 수 있음. value 호출 가능해짐)
		// 모르겠으면 저장할 데이터부터 작성 후 작성법보고 빈칸채우기하면됨
		Set<Entry<Integer, String>> set1=map1.entrySet();
		Iterator<Entry<Integer, String>> it2 = set1.iterator();
		while (it2.hasNext()) {
			Entry<Integer, String>entry=it2.next();
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" = "+value);
		}
		
	}
}
