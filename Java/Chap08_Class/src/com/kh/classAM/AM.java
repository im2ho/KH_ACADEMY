package com.kh.classAM;

public class AM {
		
		public int pNum = 10;
		protected int pNum2 = 20;
		int pNum3 = 30; //접근 제한자를 명시하지 않으면 자동으로 default 제한이 적용됨
		private int pNum4 = 40;
		
		//호출 메서드 작성해서 각각 호출하기
		
		public void publicMethod() { //어떤 클래스에서든 접근 가능
			System.out.println("public Method() 호출됨");
		}
		
		protected void protectedMethod() { //같은 패키지 내에서 접근 가능
			System.out.println("protected Method() 호출됨");
		}
		
		void defaultMethod() { //같은 패키지 내에서'만' 접근 가능
			System.out.println("default Method() 호출됨");
		}
		
		private void privateMethod() { //같은 '클래스' 내에서만 접근 가능
			System.out.println("private Method() 호출됨");
		}

}
