package org.demo.controller;

import java.util.List;
import java.util.Set;

import com.demo.beans.LogoUser;

public interface ControllerService {

	public Set<LogoUser> getListOfUser()throws Exception;
	public boolean isPresent(String name,String password) throws Exception; 
}
