package com.kh.todolist;

public class TodoListMain {

	public static void main(String[] args) {
		
		
			TodoListModel tdmodel = new TodoListModel("¾ÆÄ§¹ä ¸Ô±â");
			TodoListView tdView = new TodoListView();
			
			//System.out.println(tdmodel);
			String item = tdmodel.getItem();
			tdView.displayTodoList(item);

	}

}
