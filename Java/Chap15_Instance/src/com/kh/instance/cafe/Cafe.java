package com.kh.instance.cafe;
//카페를 방문했습니다
public class Cafe {
	private String menu; //음료종류
	private String size; //사이즈
	private boolean isSugar; //설탕 넣을거니
	
	public Cafe(String menu, String size, boolean isSugar) {
		
		this.menu = menu;
		this.size = size;
		this.isSugar = isSugar;
	}
	
	public void makeDrinks() {
		System.out.println("원하는 음료를 만들어보세요~");
		System.out.println("메뉴 : " + menu);
		System.out.println("크기 : " + size);
		//만약에 설탕을 넣는다면
		if(isSugar) {
			System.out.println("시럽추가 : " + isSugar +"\n");
		} else {
			System.out.println("시럽추가 안함"+"\n");
		}
		
	}
}