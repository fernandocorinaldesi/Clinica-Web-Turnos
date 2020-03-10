package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.TurnDAO;
import entitys.Turn;

@WebServlet("/Turnos")

public class TurnController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TurnController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
     	TurnDAO turn = new TurnDAO();
		List<Turn> turnlist = turn.getTurn();
		
		request.setAttribute("TURNOS",turnlist);
		getServletContext().getRequestDispatcher("/jsp/turnos.jsp").forward(request, response);
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
