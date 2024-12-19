package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver.*;



public class CP {
	
	static Connection con;

	public static Connection createC() {
		
		
		
		try {
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "root";
			String password = "1212";
			String url = "jdbc:mysql://localhost:3306/student_manage";
					
		    con = DriverManager.getConnection(url, user, password);
		}
		
		//create the connection....

		catch(Exception ex){
			ex.printStackTrace();
		}
		return con;
		
		
	}
}
