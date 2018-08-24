package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connections.MyConnection;

public class LoginDAO {
	
	public boolean checkLogin(String username, String password) {
		
		String CHECK_PASS = "SELECT * FROM LOGIN WHERE USERNAME = ? AND PASSWORD = ?";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(CHECK_PASS);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
	
			if(rs.next())
				return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return false;
		
	}

}
