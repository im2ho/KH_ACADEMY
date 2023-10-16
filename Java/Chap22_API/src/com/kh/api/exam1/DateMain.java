package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : 날짜와 시간 정보를 나타내는데 사용
	java1.1 이후로는 권장되지 않음...
		java.time 패키지 LocalDate LocalTime LocalDateTime
 */
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜 및 시간 : " + currentDateTime);
		
		//날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : " + futureDate);

		//minus plus 이용해서 각 2개씩 만들어보기 총 4개
		LocalDate nextYear = today.plusYears(1);
		LocalDate nextMonth = today.plusMonths(6);
		LocalDate lastDate = today.minusDays(1);
		LocalDate lastMonth = today.minusMonths(1);
		
		System.out.println("1년 후 날짜 : " + nextYear);
		System.out.println("6달 후 날짜 : " + nextMonth);
		System.out.println("어제 날짜 : " + lastDate);
		System.out.println("저번 달 날짜 : " + lastMonth);
		
		//시간 측정
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println(laterTime);
		
		//날짜비교
		LocalDate date1 = LocalDate.of(2023, 9, 13); //특정 날짜와 시간 생성하기 of
		LocalDate date2 = LocalDate.of(2024, 2, 14);
		
		if(date1.isBefore(date2)) { //어쩐지 boolean
			System.out.println(date1 + ": " + date2 +"의 이전 날짜입니다");
		} else if(date1.isEqual(date2)) {
			System.out.println("동일한 날짜입니다");
		} else { //date1.isAfter(date2)
			System.out.println("뒤에 날짜입니다");
		}
	}

}
