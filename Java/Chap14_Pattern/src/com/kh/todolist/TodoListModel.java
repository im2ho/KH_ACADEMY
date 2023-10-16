package com.kh.todolist;

public class TodoListModel {
	//할 일 목록
	private String items;
	
	//목록의 아이템
	private String item;
	
	//아이템 더하고 빼기
	
	//최초생성자
	public TodoListModel(String text) {
		this.item = text; //item = text;
	}
	
	public String getItem() {
		return item;
	}
}
