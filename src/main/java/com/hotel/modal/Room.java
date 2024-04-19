package com.hotel.modal;

public class Room {
	private int id_room;
	private String type;
	private Double price;
	private String equipement;
	private Boolean availability;
	private String url_img;
	
	
	
	public Room(int id_room, String type, Double price, String equipement, Boolean availability, String url_img) {
		super();
		this.id_room = id_room;
		this.type = type;
		this.price = price;
		this.equipement = equipement;
		this.availability = availability;
		this.url_img = url_img;
	}
	public String getUrl_img() {
		return url_img;
	}
	public void setUrl_img(String url_img) {
		this.url_img = url_img;
	}
	public Room() {
		super();
	}
	
	public int getId_room() {
		return id_room;
	}
	public void setId_room(int id_room) {
		this.id_room = id_room;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getEquipement() {
		return equipement;
	}
	public void setEquipement(String equipement) {
		this.equipement = equipement;
	}
	public Boolean getAvailability() {
		return availability;
	}
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	
	
}
