package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logoutservlet
 */
@WebServlet("/logout-servlet")
public class Logoutservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//セッションを取得
		HttpSession session = request.getSession(false);
		
		//ログアウトを押したときセッションを破棄
		if(session != null) {
			session.invalidate();
		}
		//ログイン画面に戻す
		response.sendRedirect("loginpag.jsp");
		
		
	}

}
