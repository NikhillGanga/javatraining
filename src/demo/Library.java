package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Library {
	
	

	Connection conn=DButil.getConnection();
	
	 
     public void read() {
    	 String query = "SELECT * FROM library";

	      try {
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(query); 

	          
	             System.out.println("+-----------------+---------------------------+");
	             System.out.println("| NUMBER          | MEMBER_NAME               |");
	             System.out.println("+-----------------+---------------------------+");

	             while (rs.next()) {
	                 String number = rs.getString("number");
	                 String name = rs.getString("member_name");

	                 System.out.printf("| %-15s | %-25s |%n", number, name);
	             }

	             System.out.println("+-----------------+---------------------------+");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    
     }
     public void update(String member_name,long number) {
    	
    	    String query = "UPDATE library SET member_name = ? WHERE number = ?";

    	     try {
    	         PreparedStatement ps = conn.prepareStatement(query) ;
          
    	        ps.setString(1, member_name);
    	        ps.setLong(2, number);

    	        int rowsAffected = ps.executeUpdate();

    	        System.out.println("Rows updated: " + rowsAffected);

    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    }
    	}

     
     public void write(Member member) {

    	 
    	  String member_name=member.getMemberName();
    	  long number=member.getNumber();
    	  
    	    String query = "INSERT INTO library (number, member_name) VALUES (?, ?)";

    	    try {
    	         PreparedStatement ps = conn.prepareStatement(query);

    	        ps.setLong(1, number);
    	        ps.setString(2, member_name);

    	        int rowsAffected = ps.executeUpdate();

    	        System.out.println("Rows inserted: " + rowsAffected);

    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    }
    	}

     public void delete(long number) {
    	 

    	    String query = "DELETE FROM library WHERE number = ?";

    	    try {
    	         PreparedStatement ps = conn.prepareStatement(query);

    	        ps.setLong(1, number);

    	        int rowsAffected = ps.executeUpdate();

    	        if (rowsAffected > 0) {
    	            System.out.println("Record deleted successfully");
    	        } else {
    	            System.out.println("No record found with id: " + number);
    	        }

    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    }
    	}


    
	        

	       
	
}
