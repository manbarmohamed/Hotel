package com.hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hotel.modal.Reservation;
import com.hotel.modal.Room;

public class ReservationDAOImp implements ReservationDAO{

	@Override
	public List<Reservation> selectAllReservation() {
					List<Reservation> reservations = new ArrayList<>();
			try {
				Connection cnx = DataBaseManager.getConnection();
				PreparedStatement ps= cnx.prepareStatement("select * from reservation");
				ResultSet rs= ps.executeQuery();
				
				while(rs.next()) {
					int id_res = rs.getInt("id_reservation");
					int id_rom = rs.getInt("roomId");
					String startDate = rs.getDate("startDate").toString();
					String endDate = rs.getString("endDate").toString();
					
					reservations.add(new Reservation(id_res,id_rom,startDate,endDate));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return reservations;
		}
	}

	


