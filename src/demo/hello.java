package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class hello {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/training";
        String username = "postgres";
        String password = "tiger";

        String query = "SELECT * FROM employee";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Connection Successful\n");

            while (rs.next()) {
                String id = rs.getString("emp_id");
                String name = rs.getString("emp_name");
                

                System.out.println(
                    "ID: " + id +
                    ", Name: " + name 
                   
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
