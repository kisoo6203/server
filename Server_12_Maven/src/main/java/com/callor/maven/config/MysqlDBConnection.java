package com.callor.maven.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDBConnection {
	
	private static Connection dbConn;
	
	static {
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/guestbook";
		String username = "gbuser";
		String password = "12345";
		

		try {
			Class.forName(jdbcDriver);
			if(dbConn == null) {
				dbConn = DriverManager.getConnection(url, username, password);
			}
			System.out.println("mysql 접속 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	public static Connection getDBConnection() {
		
		return dbConn;
	}
	
	

}
