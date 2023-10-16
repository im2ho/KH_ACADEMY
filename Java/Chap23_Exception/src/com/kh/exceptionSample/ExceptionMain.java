package com.kh.exceptionSample;

public class ExceptionMain {
/*
 	try {
		//예외가 발생할 수 있는 코드
	} catch {
		//발생하는 예외 처리
		//다른 예외를 처리할 수 있는 예외처리
	} finally {
		//항상 실행되는 코드 블록
	}
	
 */
	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		//exmain.ExceptionAE();
		//exmain.ExceptionNE();
		//exmain.ExceptionF();
		exmain.ExceptionExam();
	}
	
	public void ExceptionAE() {
		try {
			int result = 10/0 ; //0으로 나누는 시도
			System.out.println("result : " + result);
			} catch(ArithmeticException a) { //a: 맘대로 정할 수 있는 변수 명
			/*
			 ArithmeticException: 수학적인 계산 과정에서 발생하는 오류
			 ArithmeticException a: + 직접 지정한 변수 명
			 e로 지정한 변수로 메세지를 getMassage()로 전달받는다
			 */
			System.out.println("!산술 연산으로 인해 발생한 에러!" + a.getMessage());
			} //a.getMessage(): 에러안내메세지
		}
	
	public void ExceptionNE() {
		try {
			String text = null;
			int length = text.length(); //내용이 없는데 text로부터 문자열 길이를 얻어보자
			System.out.println("text 길이: " + length);
		} catch(NullPointerException n) {
			System.out.println("!텍스트를 넣지 않아 발생한 에러!\n" + n.getMessage());
		}
	}
	
	public void ExceptionF() {
		try {
			//850904
			String juminNumber = "팔오공904"; //기어코 똑바로 쓰지않는 금쪽이..
			int number = Integer.parseInt(juminNumber); //문자열을 정수로 변환시도
			System.out.println("숫자 : " + number); //안에 String이 들어있기 때문에 실행이 되지 않음
		} catch(NumberFormatException format) {
			System.out.println("숫자만 넣어주세요^^\n" + format.getMessage());
		}
	}

	public void ExceptionExam() {
		try {
			
			int[] numbers = {1,2,3,4,5};
			int index = 7; //인덱스 넘버 (유효하지 않음..ㅎㅎ)
			int result = numbers[index]; //배열요소에 접근
			System.out.println("Result : " + result);
			
		} catch(ArrayIndexOutOfBoundsException a) { //왠지 배열범위 문제일거같음.. 얘 한번 확인해보자
			//a: 지역변수
			System.out.println("배열 인덱스 범위를 벗어나 예외 발생\n" + a.getMessage());
		} catch(Exception e) { //Exception: 모든 에러 다 확인
			System.out.println("배열 인덱스 범위 문제가 아니지만 암튼 다른 에러");
		} finally { //항상 실행되는 블록
			System.out.println("Finally : 프로그램이종료되엇습니다 안뇽");
		}

	}
}
