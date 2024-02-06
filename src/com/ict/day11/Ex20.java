package com.ict.day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex20 {
	public static void main(String[] args) {
		// java ver. 8.0 이상에서만 사용 가능
		// LocalDate : 날짜 정보
		LocalDate cDate=LocalDate.now();		// 현재 년월일 반환
		System.out.println(cDate);
		
		LocalDate cDate2=LocalDate.of(2023,12,28);		// set 대신 of 사용시 특정날짜 지정 가능
		System.out.println(cDate2);
		
		// 날짜 비교
		System.out.println(ChronoUnit.YEARS.between(cDate, cDate2));			// 두 날짜의 기간이 1년 미만 = 0 반환
		System.out.println(ChronoUnit.MONTHS.between(cDate, cDate2));	// 두 날짜의 기간이 1달 미만 = 0 반환
		System.out.println(ChronoUnit.DAYS.between(cDate, cDate2));			// 두 날짜의 기간이 1일 미만 = 0 반환 , 2024/01/12과 비교해서 15일 차이가남
		
		// LocalTime : 시간 정보
		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);
		
		LocalTime cTime2 = LocalTime.of(17,59);		// 분 단위에서는 0~59까지만 사용가능 , 60부터 run time err
		System.out.println(cTime2);
		
		// LocalDateTime : 날짜와 시간 정보
		LocalDateTime cdt=LocalDateTime.now();
		System.out.println(cdt);
		
		LocalDateTime cdt2=LocalDateTime.of(cDate2, cTime2);
		System.out.println(cdt2);
		
		// 현재 날짜에서 증감
		// plus**() , minus**()
		System.out.println(cdt.plusYears(7));			// 7년뒤
		System.out.println(cdt.plusMonths(7));
		System.out.println(cdt.plusDays(7));
		System.out.println(cdt.plusHours(9));
		
	}
}
