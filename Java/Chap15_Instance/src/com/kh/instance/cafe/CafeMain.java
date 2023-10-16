package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		// ÈñÀºÀÌ
		Cafe client1 = new Cafe("¹Ù´Ò¶ó¶ó¶¼","Grande", false);
		// ÂàÀÌ
		Cafe june = new Cafe("¸ÛÇªÄ¡³ë", "tall", false);
		// ¿©¸§ÀÌ
		Cafe summer = new Cafe("¸Û¶ó¶¼", "tall", true);
		
		//makeDrinks ¸Ş¼­µå È£Ãâ
		client1.makeDrinks();
		june.makeDrinks();
		summer.makeDrinks();
	}

}