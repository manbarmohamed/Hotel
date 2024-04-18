package com.hotel.DAO;

import java.util.List;

import com.hotel.modal.Room;

public interface RoomDAO {
	
	 List<Room> selectAllRom();
	 boolean isReserved(int id_room);
}
