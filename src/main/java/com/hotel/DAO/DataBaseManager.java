package com.hotel.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
	
	 	public static String jdbcURL = "jdbc:mysql://localhost:3308/hotel";
	    public static String jdbcUserName = "root";
	    public static String jdbcPassword = "";
	    public static String jdbcDriver = "com.mysql.cj.jdbc.Driver";

	    
	    protected static Connection getConnection() {
	        Connection connection = null;
	        try {
	            Class.forName(jdbcDriver);
	            connection = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
	           
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }

}
