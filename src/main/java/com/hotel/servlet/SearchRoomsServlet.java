package com.hotel.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.DAO.RoomDAOImp;


@WebServlet("/SearchRoomsServlet")
public class SearchRoomsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RoomDAOImp roomDAOImp = new RoomDAOImp();
		/*String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");*/
		String type = request.getParameter("type");
		Integer capacity = Integer.valueOf( request.getParameter("capacity"));
     
     	try {
			request.setAttribute("listrooms", roomDAOImp.searchRoomByTypeCapacity( type , capacity));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	this.getServletContext().getRequestDispatcher("/SearchResult.jsp").forward(request, response);
	}

}
