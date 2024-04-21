package com.hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hotel.modal.Room;

public class RoomDAOImp implements RoomDAO {
	
	String SELECT_ALL_ROOMS_AVAILABL= "select * from room ";
	String UPDATE_AVAILABILITY_ROOM="UPDATE room SET availability = false WHERE id_room = ?";
	String SEARCH_AVALAIBL_ROOMS="SELECT * FROM room WHERE availability=true and type=? and capacity=?";
	String SEARCH_ROOMS_BY_DATE="SELECT * FROM room WHERE id_room IN (SELECT room_id FROM reservation WHERE startDate <= ? AND endDate >= ?)";
	
	
	public static void statementRoom(List<Room> arrayRoom, PreparedStatement statement) throws SQLException {
		ResultSet rs= statement.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id_room");
			String type = rs.getString("type");
			Double price = rs.getDouble("price");
			String equipment = rs.getString("equipment");
			Boolean availability = rs.getBoolean("availability");
			String url_img= rs.getString("url_img");
			String description = rs.getString("description");
			int capacity = rs.getInt("capacity");
			
			arrayRoom.add(new Room(id,type,price,equipment,availability,url_img,description,capacity));
        }
    }
	@Override
	public List<Room> selectAllRom() throws SQLException {
		List<Room> rooms = new ArrayList<>();
		
			Connection cnx = DataBaseManager.getConnection();
			PreparedStatement ps= cnx.prepareStatement(SELECT_ALL_ROOMS_AVAILABL);
			statementRoom(rooms,ps);
			
		
		return rooms;
	}

	@Override
	public boolean isReserved(int id_room) throws SQLException {
		Connection con = DataBaseManager.getConnection();
		PreparedStatement ps = con.prepareStatement(UPDATE_AVAILABILITY_ROOM);
		ps.setInt(1, id_room);
		return ps.executeUpdate() > 0;
	}

	/*@Override
	public List<Room> searchAvailableRoom(Integer roomId, String roomType, String equipement)
			throws SQLException {
		List<Room> arrayRoom = new ArrayList<>();
        Connection connection = DataBaseManager.getConnection();       
        PreparedStatement statement = connection.prepareStatement(SEARCH_AVALAIBL_ROOMS);
        
        statement.setInt(1, roomId);
        statement.setString(2, roomType);
        statement.setString(3, equipement);
        statementRoom(arrayRoom,statement);
		return arrayRoom;

}*/
	@Override
	public List<Room> searchRoomByTypeCapacity(String type, Integer capacity) throws SQLException {
		List<Room> arrayRoom = new ArrayList<>();
		Connection connection = DataBaseManager.getConnection();       
        PreparedStatement statement = connection.prepareStatement(SEARCH_AVALAIBL_ROOMS);
        
        statement.setString(1, type);
        statement.setInt(2,capacity);
        

        statementRoom(arrayRoom,statement);
		
		return arrayRoom;
	}
	@Override
	public List<Room> searchRoomByDate(String startDate, String endDate) throws SQLException {
		List<Room> arrayRoom = new ArrayList<>();
		Connection connection = DataBaseManager.getConnection();       
        PreparedStatement statement = connection.prepareStatement(SEARCH_ROOMS_BY_DATE);
        
        statement.setString(1, startDate);
        statement.setString(2, endDate);
        statementRoom(arrayRoom,statement);
		return arrayRoom;
	}
	}
