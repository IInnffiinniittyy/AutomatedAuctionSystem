package com.AuctionApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.AuctionApp.Exceptions.AdministratorException;
import com.AuctionApp.JavaBeanFiles.Administrator;
import com.AuctionApp.Utility.DBUtil;

public class AdministratorDaoImpl implements AdministratorDao {

	@Override
	public Administrator loginAdministrator(String ausername, String apassword) throws AdministratorException {
		Administrator admin = null;
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("Select * from Administrator Where aEmail = ? AND aPassword = ?");
			
			ps.setString(1, ausername);
			ps.setString(2, apassword);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
		    	int id = rs.getInt("aID");
		    	String name = rs.getString("aName");
		    	String email = rs.getString("aEmail");
		    	String password = rs.getString("apassword");
		    	admin = new Administrator(id, name, email, password);
		    	
		    }else {
		      throw new AdministratorException("Invalid Username or Password");
		    }
			
			
		} catch (SQLException e) {
			throw new AdministratorException(e.getMessage());
		}
		
		
		
		return admin;
	}

}
