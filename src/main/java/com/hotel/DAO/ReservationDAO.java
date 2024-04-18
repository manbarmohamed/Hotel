package com.hotel.DAO;

import java.sql.SQLException;
import java.util.List;

import com.hotel.modal.Reservation;


public interface ReservationDAO {

	List<Reservation> selectAllReservation();
	public void saveReservation(Reservation reservation) throws SQLException;
	public void cancelReservation(int id) throws SQLException;
}
