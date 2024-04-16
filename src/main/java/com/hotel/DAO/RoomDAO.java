package com.hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hotel.modal.Room;

public class RoomDAO implements ProjetDAO {
	@Override
	public List<Room> selectAllRom() {
		List<Room> rooms = new ArrayList<>();
		try {
			Connection cnx = DataBaseManager.getConnection();
			PreparedStatement ps= cnx.prepareStatement("select * from room");
			ResultSet rs= ps.executeQuery();
			System.out.println("rrrrrrrrrrrrrrrrrrr");
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

}
