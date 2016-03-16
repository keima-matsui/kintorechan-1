package com.kintore.afterlogin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kintore.bean.FavMenu;
import com.kintore.bean.RecMenu;
import com.kintore.dao.MenuDao;
import com.kintore.dao.UserDao;

/**
 * Servlet implementation class ToMypage
 */
@WebServlet("/mypage")
public class ToMypage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ToMypage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		HttpSession session = request.getSession();
		String username = session.getAttribute("username").toString();
		
		int id = UserDao.GetId(username);
		
		List<FavMenu> favList = new ArrayList<FavMenu>();
		List<RecMenu> recList = new ArrayList<RecMenu>();
		
		
		favList = MenuDao.GetFavMenu(id);
		recList = MenuDao.GetRecMenu(id);
		
		
		request.setAttribute("favList", favList);
		request.setAttribute("recList", recList);
		
		
		
		request.setCharacterEncoding("utf-8");
		RequestDispatcher disp = getServletContext().getRequestDispatcher("/WEB-INF/mypage.jsp");
		disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
