package com.cg.util;

import java.sql.Connection;
import java.sql.SQLException;

public class Execute {

	public static void main(String[] args) throws SQLException {
		Connection connection=DbUtil.getconnection();
		if(connection !=null)
		{
			System.out.println("Connection sucessfully");
		}
         StatementInterface.readAllFile();
	}

}
