package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionCatchBlock {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies1";
		String username = "root";
		String password = "root";
		String query = "Call SelectAllMovies()";
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		con = DriverManager.getConnection(dburl,username,password);
			Statement stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				
				System.out.print("Title: " + rs.getString("title") + "\t");
				System.out.print("genre: " + rs.getString("genre") + "\t");
				System.out.print("director: " + rs.getString("director") + "\t");
				System.out.println("release_year: " + rs.getString("release_year"));
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
