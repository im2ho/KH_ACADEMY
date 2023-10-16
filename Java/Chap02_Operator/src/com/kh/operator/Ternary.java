package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		// 6. 삼항 연산자: 조건을 평가하고 세 가지 값 중 하나를 반환
		
		/*
		 조건 ? 값1       : 값2        형태로 사용
		 조건 ? 값1(=true): 값2(=false)
		 
		 값1은 조건이 참일 때 출력
		 값2는 조건이 거짓일 때 출력
		 
		
		 */
		
		 //ex) 나이가 20인 사람이 있음. 이 사람은 성인인가? 미성년자인가?
		 
		/* 
		
		int age = 20;
		 
		 //                  조건     ?   값1      값2
		 String status = (age >= 20) ? "성인" : "미성년자"; // 값1: true일 때 출력 /  값2: false일 때 출력
		 System.out.println(status);
		 
		 int score = 85;
		 String result = (score >= 60) ? "합격" : "불합격";
		 System.out.println("시험결과 : " + result);
		 
		 int number = -5;
		 String sign = (number > 0) ? "true" : "false";
		 System.out.println("sign : " + sign);
		 
		 int temperature = 25;
		 String weather = (temperature > 21) ? "적당한 날씨" : "추운 날씨";
		 System.out.println("날씨상태 : " +  weather);
		 
		 
		 */
		
		 // 숫자 7의 값을 짝수인지 홀수인지 출력 1
		
		 int num=7;
		 
		 String even = (num %2 == 0) ? "짝수" : "홀수";
		 System.out.println("홀짝 판별 : " + even);
		 
		 //참고용 (조건을 옆으로 넘기고 넘기는 모양)
		 //삼항 연산자 안에 삼항 연산자.. (사용은 거의 안함)
		 int number2 = -5;
		 //             |    조건1     |    ->   |    조건2    |   ->   |조건3| 
		 String sign2 = (number2 > 0) ? "양수" : (number2 <0) ? "음수" : "0";
		 System.out.println("숫자의 부호 : " + sign2);

	}

}
