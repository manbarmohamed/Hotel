package com.hotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.DAO.ReservationDAOImp;
import com.hotel.modal.Reservation;

/**
 * Servlet implementation class Reservation_history
 */
@WebServlet("/Reservation_history")
public class Reservation_history extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Reservation_history() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservationDAOImp reservationdao = new ReservationDAOImp();
		List<Reservation> reservations = reservationdao.selectAllReservation();
		request.setAttribute("listreservation", reservations);	
		request.getRequestDispatcher("/reservation-success.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
