package com.kintore.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kintore.bean.User;
import com.kintore.dao.UserDao;

/**
 * Servlet implementation class UserManageServlet
 */
@WebServlet("/user")
public class UserManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserManageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String control = request.getParameter("control");

		UserDao UserDao = new UserDao();
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(600);
		RequestDispatcher disp;
		
		switch(control){
			case "signup":

				User user = new  User(username,password);
				UserDao.regist(user);
				
				session.setAttribute("username", username);
				
				
				
				response.setContentType( "text/html;charset=utf-8");
				disp = getServletContext().getRequestDispatcher("/WEB-INF/login_result.jsp");
				disp.forward(request, response);
			
				break;
			
			case "signin": 

				int flag = UserDao.SignIn(username, password);
				
				if (flag == 1){
					session.setAttribute("username", username);
					response.setContentType( "text/html;charset=utf-8");
					disp = getServletContext().getRequestDispatcher("/WEB-INF/login_result.jsp");
					disp.forward(request, response);
				}else{
					disp = getServletContext().getRequestDispatcher("/WEB-INF/login.jsp");
					disp.forward(request, response);
				}
				
				break;
				
		}
		
	}

}
