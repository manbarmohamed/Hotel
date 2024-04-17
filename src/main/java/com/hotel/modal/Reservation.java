package com.hotel.modal;



public class Reservation {
	private int id_res;
    private int roomId;
    private String startDate;
    private String endDate;
    
    
    
    public Reservation() {
		super();
	}
	public Reservation(int id_res, int roomId, String startDate, String endDate) {
		super();
		this.id_res = id_res;
		this.roomId = roomId;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getId_res() {
		return id_res;
	}
	public void setId_res(int id_res) {
		this.id_res = id_res;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
    
    
}
