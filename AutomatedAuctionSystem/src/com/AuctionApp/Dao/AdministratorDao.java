package com.AuctionApp.Dao;

import com.AuctionApp.Exceptions.AdministratorException;
import com.AuctionApp.JavaBeanFiles.Administrator;

public interface AdministratorDao {
	
	public Administrator loginAdministrator(String ausername, String apassword) throws AdministratorException;

}
