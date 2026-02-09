package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {

	public static Connection getConnection()
	{
		String url = "jdbc:postgresql://localhost:5433/training";
	    String username = "postgres";
	    String password = "tiger";
	    Connection conn=null;
	    try
	    {
	    	  conn = DriverManager.getConnection(url, username, password);
	    }
	    catch(SQLException e)
	    {
	    	e.printStackTrace();
	    }
	    return conn;
	}
}
