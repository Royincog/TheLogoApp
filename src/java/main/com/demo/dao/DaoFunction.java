package com.demo.dao;

import java.sql.ResultSet;

import com.demo.beans.LogoUser;

public interface DaoFunction{

	//Insert User Beans into data base
	public void insertUserofLogo(LogoUser user)throws Exception;
	
	
	//Validate user present in the data base
	public ResultSet gettheLogoResultSet()throws Exception;
}
