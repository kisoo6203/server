package com.callor.html;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContract {
	
	static Connection dbConn;
	
	static {
		
		String jdbcDriver = "";
		String url = "";
		String username = "myfood";
		String password = "myfood";
		
		try {
			
			dbConn = DriverManager.getConnection(url, username, password);
			System.out.println("오라클 접속 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클 접속 실패");
		}
		
	}
	
	public void getDbConnection() {
		return dbConn;
	}

}
