package com.cg.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInterface {
	
	//create
	
	public static void createdata() throws SQLException
    {
      Connection connection=DbUtil.getconnection();
      Statement st=connection.createStatement();
      String sqlinsert= "INSERT INTO file(id,name,city)" + "value(1,'Naveen','Chennai')";
      int execute=st.executeUpdate(sqlinsert);
      if(execute==1)
      {
    	  System.out.println("Data added Sucessfully");
      }
    }

    //update
	
	public static void updatedata()throws SQLException
	{
		Connection connection=DbUtil.getconnection();
		Statement st=connection.createStatement();
		String sqlupdate="UPDATE file SET name = 'NaveenDepp' where id = 1";
		int execute=st.executeUpdate(sqlupdate);
		if(execute==1)
			System.out.println("Data to Be Updated Sucessfully");
	
	}
	
   //Delete
	public static void deletedata()throws SQLException
	{
		Connection connection=DbUtil.getconnection();
		Statement st=connection.createStatement();
		String sqlDelete="DELETE FROM file WHERE id = 1";
		int execute=st.executeUpdate(sqlDelete);
		if(execute==1)
		{
			System.out.println("Data deleted successfully");
		}
		
	}
	
	public static void readByIdData()throws SQLException
	{
		Connection connection=DbUtil.getconnection();
		Statement st=connection.createStatement();
		String sqlreadall = "SELECT* FROM file WHERE id=1";
		
		ResultSet rs=st.executeQuery(sqlreadall);		
	    
		if(rs.next())
	    {
	    	int id=rs.getInt(1);
	    	String name=rs.getString(2);
	    	String city=rs.getString(3);
	    	System.out.println(id+""+name+""+city);    	
	    }
		else 
		{
			System.out.println("No data found");
		}
		
	}
	
	public static void readAllFile()throws SQLException
		
	{
		Connection connection=DbUtil.getconnection();
		Statement st=connection.createStatement();
		String sqlreadall="SELECT* FROM file";
		
		ResultSet rs=st.executeQuery(sqlreadall);
		
		while(rs.next())
		{
          
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String city=rs.getString(3);
			
			System.out.println(id+""+name+""+city);
			
		}	
	}
}