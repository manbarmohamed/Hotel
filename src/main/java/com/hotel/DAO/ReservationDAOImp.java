package com.hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hotel.modal.Reservation;
import com.hotel.modal.Room;

public class ReservationDAOImp implements ReservationDAO{
	
	private RoomDAO roomdao;
	
	String SELECT_RESERVATION_SQL="select * from reservation";
	String SAVE_RESERVATION="INSERT INTO reservation (id_reservation, roomId, startDate, endDate) VALUES (?, ?, ?, ?)"; 
	String CANCEL_RESERVATION ="DELETE FROM reservation WHERE id_reservation=?";

	@Override
	public List<Reservation> selectAllReservation() {
					List<Reservation> reservations = new ArrayList<>();
			try {
				Connection cnx = DataBaseManager.getConnection();
				PreparedStatement ps= cnx.prepareStatement(SELECT_RESERVATION_SQL);
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

	@Override
	public void saveReservation(Reservation reservation) throws SQLException {
		Connection cnx = DataBaseManager.getConnection();
		PreparedStatement ps= cnx.prepareStatement(SAVE_RESERVATION);
		ps.setInt(1, reservation.getId_res());
		ps.setInt(2,reservation.getRoomId());
		ps.setString(3, reservation.getStartDate());
		ps.setString(4, reservation.getEndDate());
		ps.executeUpdate();
		roomdao = new RoomDAOImp();
		roomdao.isReserved(reservation.getRoomId());
		
	}

	@Override
	public void cancelReservation(int id) throws SQLException {
		
		
	}

	


	
	}

	


