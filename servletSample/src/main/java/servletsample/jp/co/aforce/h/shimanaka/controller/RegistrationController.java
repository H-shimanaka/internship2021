package servletsample.jp.co.aforce.h.shimanaka.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servletsample.jp.co.aforce.h.shimanaka.model.RegistrationModel;


/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//httpリクエストの文字コードを指定
		request.setCharacterEncoding("UTF-8");
		
		//formからid,password,userNameの値を文字としてそのまま取得
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String userName = request.getParameter("userName");

		//年齢だけは入力されていなかった場合、0を代入
		//入力されていた場合、int型に変更する
		int age;
		if(request.getParameter("age") == "") {
			age = 0;
		}else {
			age = Integer.parseInt(request.getParameter("age"));
		}
		
		
		RegistrationModel model = new RegistrationModel();
		int insert = model.registerNewUserData(id, password, userName, age);
		
		if(insert == 0) {
			request.setAttribute("errorMsg","ユーザ登録に失敗しました。");
			
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("signin.jsp");
			rd.forward(request, response);
		}
	}

}
