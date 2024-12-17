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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete-servlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	@SuppressWarnings({"unchecked" })
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//セッションを取得
		HttpSession session = request.getSession(true);
		
		String[] Todos = request.getParameterValues("Todos");
		
		//チェックボックスが押されたときにリストを破棄する
		if(session != null) {

			ArrayList<TodoItem> todoList = (ArrayList<TodoItem>) session.getAttribute("todoList");
			
			if(todoList != null) {
				for(String todo : Todos) {

					todoList.remove(Integer.parseInt(todo));
				}
				
				session.setAttribute("todoList", todoList);
			}
		}
		response.sendRedirect("main.jsp");
	}

}
