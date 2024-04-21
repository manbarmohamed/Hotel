package com.hotel.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.DAO.ReservationDAO;
import com.hotel.DAO.ReservationDAOImp;
import com.hotel.DAO.RoomDAOImp;
import com.hotel.modal.Reservation;


@WebServlet("/ReservationSuccessServlet")
public class ReservationSuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ReservationDAO reservationDAO;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id_Room = Integer.valueOf(request.getParameter("roomId"));
				String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");	
		Reservation reservation = new Reservation(id_Room,startDate,endDate);
		
			reservationDAO = new ReservationDAOImp(); // Assume dataSource is configured
			try {
				reservationDAO.saveReservation(reservation);
			} catch (SQLException e) {
					e.printStackTrace();
			}
			RoomDAOImp roomDAOImp = new RoomDAOImp();
		    try {
				request.setAttribute("listrooms", roomDAOImp.selectAllRom());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		    request.getRequestDispatcher("/SearchRooms.jsp").forward(request, response);

	        //response.sendRedirect("SearchRooms.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
