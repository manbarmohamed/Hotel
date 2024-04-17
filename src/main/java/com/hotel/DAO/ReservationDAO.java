package com.hotel.DAO;

import java.util.List;

import com.hotel.modal.Reservation;


public interface ReservationDAO {

	List<Reservation> selectAllReservation();
}
