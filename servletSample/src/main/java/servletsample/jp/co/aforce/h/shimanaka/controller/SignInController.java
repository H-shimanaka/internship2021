package servletsample.jp.co.aforce.h.shimanaka.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servletsample.jp.co.aforce.h.shimanaka.dto.UsersDto;
import servletsample.jp.co.aforce.h.shimanaka.model.SigninModel;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		if(session == null) {
			RequestDispatcher rd = request.getRequestDispatcher("signin.jsp");
			rd.forward(request, response);
		}else {
			System.out.println(session.getAttribute("name"));
			RequestDispatcher rd = request.getRequestDispatcher("top.jsp");
			rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		SigninModel model = new SigninModel();
		UsersDto result = model.checkExistsUser(id, password);
		
		if(result.getUserID() == null) {
			request.setAttribute("errorMsg", "IDまたはパスワードが誤っています。");
			
			RequestDispatcher rd = request.getRequestDispatcher("signin.jsp");
			rd.forward(request, response);
		}else {
			HttpSession session = request.getSession(true);
			
			session.setAttribute("name", result.getUserName());
			session.setAttribute("age", result.getAge());
			
			request.setAttribute("userData", result);
			request.setAttribute("name", result.getUserName());
			request.setAttribute("age", result.getAge());
			
			RequestDispatcher rd = request.getRequestDispatcher("top.jsp");
			rd.forward(request, response);
		}
		
	}

}
