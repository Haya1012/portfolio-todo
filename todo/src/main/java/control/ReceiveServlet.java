package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ReceiveServlet
 */
@WebServlet("/receive-servlet")
public class ReceiveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//データの取得
		String task = request.getParameter("task");
		String date = request.getParameter("date");
		
		if(task != null && date != null && !task.isEmpty() && !date.isEmpty()) {
			HttpSession session = request.getSession();
			
			//sessionからtodoリストを取得
			ArrayList<TodoItem> todolist = (ArrayList<TodoItem>) session.getAttribute("todoList");
			if(todolist == null) {
				todolist = new ArrayList<>();
			}
			
			todolist.add(new TodoItem(task, date));
			
			session.setAttribute("todoList" , todolist);
		}
		
		//メイン画面に戻す
		response.sendRedirect("main.jsp");
	}
}
