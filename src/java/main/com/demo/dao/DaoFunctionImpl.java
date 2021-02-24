package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.demo.utility.getConnection;

import com.demo.beans.LogoUser;
public class DaoFunctionImpl implements DaoFunction{

	@Override
	public void insertUserofLogo(LogoUser user) throws Exception {
		// TODO Auto-generated method stub
		Connection con = getConnection.getConnection();
		String query = "INSERT INTO user_info values(?,?)";
		
		PreparedStatement statement =  con.prepareStatement(query);
		statement.setString(1, user.getUserName());
		statement.setString(2, user.getPassword());
		int count = statement.executeUpdate();
	
		System.out.println(count + " row updated");
	}

	@Override
	public ResultSet gettheLogoResultSet() throws Exception {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM user_info";
		ResultSet result = null;
		Connection con = getConnection.getConnection(); 
	
			PreparedStatement statement =  con.prepareStatement(query);
			result = statement.executeQuery(query);
			
			return result;
	}

}
