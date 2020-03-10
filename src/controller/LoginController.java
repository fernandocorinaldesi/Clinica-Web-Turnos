package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daos.TurnDAO;
import daos.UserDAO;
import entitys.Turn;
import entitys.User;



@WebServlet("/Login")
public class LoginController extends HttpServlet{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       	
		getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response);
	}
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String user = request.getParameter("user");
	        String password = request.getParameter("password");
	         
	        UserDAO userDao = new UserDAO();
	         
	        User usr = userDao.checkLogin(user, password);
			String destPage = "/jsp/login.jsp";
			 
			if (usr != null) {
			    HttpSession session = request.getSession();
			    session.setAttribute("user", user);
			    destPage = "/jsp/home.jsp";
			} else {
			    String message = "usuario o contraseña invalidas";
			    request.setAttribute("message", message);
			}
			 
			RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
			dispatcher.forward(request, response);
	    }



}
