package com.kh.api.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeMain2 sb = new PracticeMain2();
		
		sb.practice1();
		sb.practice2();
		sb.practice3();
		sb.practice4();
		sb.practice5();
	}
	
	public void practice1() {
		//StringBuffer È°¿ë ¹®Á¦
		//¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append
		
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã "); //Àú³á ¹¹¸ÔÁö
		sb.append("Àú³á ¹¹¸ÔÁö");
		System.out.println(sb.toString());
	}
	
	public void practice2() {
		//¹®ÀÚ¿­ µÚÁı±â reverse ¿À´Ã Àú³á ¹¹¸ÔÁö
		StringBuffer sb = new StringBuffer();
		sb.append ("¿À´Ã Àú³á ¹¹¸ÔÁö");
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public void practice3() {
		//¹®ÀÚ¿­ »ğÀÔ insert '?¤¾¤¾'
		String str = "¿À´Ã Àú³á ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer(str);
		sb.insert(9, "? ¤¾¤¾");
		System.out.println(sb.toString());
	}
	
	public void practice4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace(,,);
		/*¹æ¹ı1
		String str = "¿À´Ã Àú³á ¹¹¸ÔÁö";
		String reStr = str.replace("¹¹¸ÔÁö", ",,,");
		System.out.println(reStr);
		*/
		//¹æ¹ı2 StringBuffer»ç¿ë
	}
	
	public void practice5() {
		//¹®ÀÚ¿­ »èÁ¦ delete(,,);
		String str = "¿À´Ã Àú³á ¹¹¸ÔÁö,,";
		StringBuffer sb = new StringBuffer(str);
		sb.delete(9, 12);
		System.out.println(sb.toString());
	}

}