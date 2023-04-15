package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	
	public static final String db_driverclass="com.mysql.cj.jdbc.Driver";
	public static final String db_url="jdbc:mysql://localhost:3306/jdbcdatabase";
	public static final String db_name="root";
	public static final String db_password= "naveen520bluepavi";
	public static Connection con;
	
	
	public static Connection getconnection() 
	{
		try 
		{
			Class.forName(db_driverclass);
			System.out.println("Driver loaded Sucessfully");
		   
			con=DriverManager.getConnection(db_url,db_name,db_password);
			System.out.println("Connection established successfully");
		}		
		catch(Exception e)
		{
			System.out.println(e);			
		}
		
		return con;
	}

}
