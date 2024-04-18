package com.hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hotel.modal.Room;

public class RoomDAOImp implements RoomDAO {
	
	String SELECT_ALL_ROOMS_AVAILABL= "select * from room";
	String UPDATE_AVAILABILITY_ROOM="UPDATE room SET availability = false WHERE id_room = ?";
	
	@Override
	public List<Room> selectAllRom() {
		List<Room> rooms = new ArrayList<>();
		try {
			Connection cnx = DataBaseManager.getConnection();
			PreparedStatement ps= cnx.prepareStatement(SELECT_ALL_ROOMS_AVAILABL);
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id_room");
				String type = rs.getString("type");
				Double price = rs.getDouble("price");
				String equipment = rs.getString("equipment");
				Boolean availability = rs.getBoolean("availability");
				
				rooms.add(new Room(id,type,price,equipment,availability));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rooms;
	}

	@Override
	public boolean isReserved(int id_room) throws SQLException {
		Connection con = DataBaseManager.getConnection();
		PreparedStatement ps = con.prepareStatement(UPDATE_AVAILABILITY_ROOM);
		ps.setInt(1, id_room);
		
		return ps.executeUpdate() > 0;
	}

}
