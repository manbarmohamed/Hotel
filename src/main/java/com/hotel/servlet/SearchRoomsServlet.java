package com.hotel.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.DAO.RoomDAOImp;
import com.hotel.modal.Room;


@WebServlet("/SearchRoomsServlet")
public class SearchRoomsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RoomDAOImp roomDAOImp = new RoomDAOImp();
		String type = request.getParameter("type");
		String capacityParam = request.getParameter("capacity");

		if (type != null && !type.isEmpty() && capacityParam != null && !capacityParam.isEmpty()) {
		    try {
		        Integer capacity = Integer.valueOf(capacityParam);
		        List<Room> rooms = roomDAOImp.searchRoomByTypeCapacity(type, capacity);
		        request.setAttribute("listrooms", rooms);
		    } catch (NumberFormatException | SQLException e) {
		        // Handle NumberFormatException and SQLException appropriately
		        e.printStackTrace();
		    }
		} else {
		    // Handle missing or empty parameters
		    // You can redirect the user to an error page or display a message
		}

		request.getRequestDispatcher("/SearchRooms.jsp").forward(request, response);

	}

}
