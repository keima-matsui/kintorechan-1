package com.kintore.afterlogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kintore.bean.Menu;
import com.kintore.bean.User;
import com.kintore.dao.MenuDao;
import com.kintore.dao.UserDao;

/**
 * Servlet implementation class ToAdd
 */
@WebServlet("/add")
public class ToAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ToAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		RequestDispatcher disp = getServletContext().getRequestDispatcher("/WEB-INF/add.jsp");
		disp.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		String menu = request.getParameter("menu");
		String spot = request.getParameter("spot");
		int times = Integer.parseInt(request.getParameter("times"));
		String username = session.getAttribute("username").toString();
		
		int id = UserDao.GetId(username);
		
		MenuDao MenuDao = new MenuDao();
	
		Menu menu_ = new  Menu(id,menu,spot,times);
		MenuDao.AddMenu(menu_);
		
		response.setContentType( "text/html;charset=utf-8");
		RequestDispatcher disp = getServletContext().getRequestDispatcher("/WEB-INF/add_result.jsp");
		disp.forward(request, response);
		
	}

}
