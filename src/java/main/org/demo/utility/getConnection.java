package org.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class getConnection {

	private static final String url = "jdbc:mysql://localhost:3306/logodatabase";
	private static final String uName = "root";
	private static final String password = "password";
	private static final String driverName = "com.mysql.cj.jdbc.Driver";

	private static Connection con;
	
	public static Connection getConnection()throws Exception{
	
		
	Class.forName(driverName);	
	con = DriverManager.getConnection(url,uName,password);	
	return con;
	} 
	
}
