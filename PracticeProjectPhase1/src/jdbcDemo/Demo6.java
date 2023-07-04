package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306/animated_moviess";
		String username = "root";
		String password = "Sanu0837#@1";
		String query = "INSERT INTO moviess VALUE(\"Finding Nemo\", \"Comedy-Drama\" , \"Andrew Stanton\");";
        
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl, username , password);
	        Statement stmt = con.createStatement();
	        stmt.execute(query);
		    }
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			con.close();
		}
	}

}
