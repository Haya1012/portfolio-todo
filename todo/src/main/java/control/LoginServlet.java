package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login-servlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");

	//パスワードがtodoの時承認
	boolean result = password.equals("todo");
	
	if(password.equals("todo")) {
		response.sendRedirect("main.jsp");
	}else {
	//エラーメッセージ
		request.setAttribute("errorMsg", "パスワードに 誤りがあります。");	
	//ログインページに戻す
		RequestDispatcher dispatcher = request.getRequestDispatcher("loginpag.jsp");
		dispatcher.forward(request, response);
	}

	}
}
