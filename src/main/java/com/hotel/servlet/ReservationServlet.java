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
		/*Integer id = Integer.valueOf(request.getParameter("id"));
		System.out.print(id);
		request.setAttribute("roomId", id);*/
		
		
		 String idParameter = request.getParameter("id");
	        if (idParameter != null) {
	            try {
	                // Conversion du paramètre "id" en Integer
	                Integer id = Integer.valueOf(idParameter);

	                // Affichage de l'ID dans la console (pour le débogage)
	                System.out.print(id);

	                // Ajout de l'ID en tant qu'attribut de la requête
	                request.setAttribute("roomId", id);
	            } catch (NumberFormatException e) {
	                // Gestion des cas où le paramètre "id" n'est pas un entier valide
	                // Vous pouvez logger une erreur ou gérer cette exception selon les besoins de votre application
	                e.printStackTrace();
	            }
	        }
	        request.getRequestDispatcher("/Reservation.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Reservation.jsp").forward(request, response);
	}

}
