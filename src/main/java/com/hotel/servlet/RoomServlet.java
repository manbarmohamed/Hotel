package com.hotel.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.DAO.RoomDAOImp;
import com.hotel.modal.Room;


@WebServlet("/RoomServlet")
public class RoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RoomDAOImp roomDAOImp = new RoomDAOImp();
	    List<Room> rooms = roomDAOImp.selectAllRom();
	    request.setAttribute("listrooms", rooms); 
	    request.getRequestDispatcher("/Room.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Room.jsp").forward(request, response);
	}


	}


