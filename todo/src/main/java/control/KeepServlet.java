package control;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


/**
 * Servlet implementation class KeepServlet
 */
@WebServlet("/keep-servlet")
public class KeepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//todoリストの保存
	private ArrayList<TodoItem> todoList = new ArrayList<>();
	
	public ArrayList<TodoItem> getTodoList() {
		return todoList;
	}
	
	public void addTodoItem(TodoItem item) {
		todoList.add(item);
	}
	
		public void removeTodoItem(int index) {
			if(index >= 0 && index < todoList.size()) {
				todoList.remove(index);
			
		}
	}


}
