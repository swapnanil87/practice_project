package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306/animated_moviess";
		String username = "root";
		String password = "Sanu0837#@1";
		String query = "Call SelectAllMovies();";
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl, username , password);
        Statement stmt = con.createStatement(); 
        ResultSet rs = stmt.executeQuery(query);
        
        while (rs.next()) {
        	System.out.println("Title: "+ rs.getString("title") + "\t" );
            System.out.println("genre: " + rs.getString("genre") + "\t");
            System.out.println("director: " + rs.getString("director") + "\t");
            }

	    }
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			con.close();
		}
	
      }
}

