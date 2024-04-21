package com.hotel.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hotel.modal.Room;

public interface RoomDAO {
	
	 List<Room> selectAllRom() throws SQLException;
	 boolean isReserved(int id_room) throws SQLException;
	 public List<Room> searchRoomByTypeCapacity(String type, Integer capacity) throws SQLException;
	 public List<Room> searchRoomByDate(String startDate , String endDate) throws SQLException;
}
