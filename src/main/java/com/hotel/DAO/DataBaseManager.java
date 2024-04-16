package com.hotel.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
	
	 	public String jdbcURL = "jdbc:mysql://localhost:3308/employee_db";
	    public String jdbcUserName = "root";
	    public String jdbcPassword = "";
	    public String jdbcDriver = "com.mysql.cj.jdbc.Driver";

	    
	    protected Connection getConnection() {
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
