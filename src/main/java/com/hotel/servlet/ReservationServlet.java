package com.hotel.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.DAO.ReservationDAO;
import com.hotel.DAO.ReservationDAOImp;
import com.hotel.modal.Reservation;


@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservationDAOImp reservationdao = new ReservationDAOImp();
		List<Reservation> reservations = reservationdao.selectAllReservation();
		request.setAttribute("listreservation", reservations);
		request.getRequestDispatcher("/Reservation.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Reservation.jsp").forward(request, response);
	}

}
