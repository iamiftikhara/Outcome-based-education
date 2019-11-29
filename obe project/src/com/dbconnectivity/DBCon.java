package com.dbconnectivity;

import java.sql.*;

public class DBCon {

	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	private final String CLASS_NAME="com.mysql.cj.jdbc.Driver";
	private final String URL="jdbc:mysql://localhost:3306/obe";
	private final String NAME="root";
	private final String PSW="password";
	
	public DBCon() throws ClassNotFoundException, SQLException{
		Class.forName(CLASS_NAME);
		con=DriverManager.getConnection(URL,NAME,PSW);
		stmt=con.createStatement();
	}
	
	public Statement getStmt(){
		return stmt;
	}
	public Connection getConnection(){
		return con;
	}
	
	public void closeCon() throws SQLException{
		con.close();
	}
	
	public void closeStmt() throws SQLException{
		stmt.close();
	}
}

