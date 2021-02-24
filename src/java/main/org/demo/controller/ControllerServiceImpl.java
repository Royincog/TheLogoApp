package org.demo.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.LogoUser;
import com.demo.dao.DaoFunction;
import com.demo.dao.DaoFunctionImpl;

public class ControllerServiceImpl implements ControllerService{
	static DaoFunction daoFunction = new DaoFunctionImpl(); 

	@Override
	public Set<LogoUser> getListOfUser() throws Exception {
		 Set<LogoUser> logoUsers = new HashSet<LogoUser>();
		// TODO Auto-generated method stub
		ResultSet result = daoFunction.gettheLogoResultSet();
		while(result.next()) {
			LogoUser user = new LogoUser(result.getString("name"),result.getString("password")); 
	
			logoUsers.add(user);
		}
		return logoUsers;
		}
	@Override
	public boolean isPresent(String name, String password) throws Exception {
		
		for(LogoUser logoUser : getListOfUser()) {
			if((logoUser.getUserName().equals(name)) && (logoUser.getPassword().equals(password))) {
			
				return true;
			}
		}
	return false;
	}

}
