package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

//주문 객체
public class Order implements FoodStore{
	private List<Menu> OrderMenus;
	
	public Order() {
		OrderMenus = new ArrayList<>();
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu); //파라미터 값이 똑같을경우 에러남
		OrderMenus.add(menu);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
}