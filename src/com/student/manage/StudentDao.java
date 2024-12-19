package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;

import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;



public class StudentDao {
public static boolean insertStudentToDB(student st) {
	
	boolean f=false;
	//JDBC Code....
	try {
		Connection con = CP.createC();
		String q = "insert into student(student_name,student_phone,student_city) values(?,?,?)"; 
		//preparedStatement
		
		PreparedStatement pstmt = con.prepareStatement(q);
		//set the valus of parameters
 		pstmt.setString(1, st.getStudentName());
 		pstmt.setString(2, st.getStudentPhone());
 		pstmt.setString(3, st.getStudentCity());
 		
 		//Execute
 		pstmt.executeUpdate();
 		f=true;
 		
 		
 		
 		
	} catch (Exception e) {
		
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
	
	
	
}

public static boolean deleteStudent(int userId) {
	// TODO Auto-generated method stub
	
	
	boolean f=false;
	//JDBC Code....
	try {
		Connection con = CP.createC();
		String q = "delete from student where student_id=?"; 
		java.sql.Statement stmt = con.createStatement(); 
		
		ResultSet set = stmt.executeQuery(q);
		
 		f=true;
 		
	} catch (Exception e) {
		
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}

public static boolean showAllStudent() {

	boolean f=false;
	//JDBC Code....
	try {
		Connection con = CP.createC();
		String q = "select * from students;"; 
		//preparedStatement
		
		PreparedStatement pstmt = con.prepareStatement(q);
		int userId = 0;
		//set the valus of parameters
 		pstmt.setInt(1, userId);
 		
 		//Execute
 		pstmt.executeUpdate();
 		f=true;
 		
	} catch (Exception e) {
		
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}
	// TODO Auto-generated method stub

public static void showAllStudent1() {
	// TODO Auto-generated method stub
	
}
	
}

