package com.kh.api.exam1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpledateFormatMain {

/*
 SimpleDateFormat
 	날짜와 시간을 원하는 형식으로 포멧팅하거나
 	문자열로부터 날짜와 시간을 파싱하는데 사용되는 클래스
 	
 	yyyy-MM-dd a HH:mm:ss:S (E)
 	y : 연도
 	M : 월
 	d : 일
 	a : 오전/오후
 	H : 24시간 형식의 시간
 	m : 분
 	s : 초
 	S(대문자) : 소수점단위 초 (개수만큼 자세히 출력)
 	(E) : 요일
 	
 */
	public static void main(String[] args) {
		Date currentDate = new Date(); //sql import X
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//포맷팅된 문자열로 변환
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}

}
