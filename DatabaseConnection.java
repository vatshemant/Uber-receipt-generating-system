package uberReciptSystem;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DatabaseConnection {

	public static Connection getConnection() throws Exception{
		 try{
			   String driver = "com.mysql.jdbc.Driver";
			   String url = "jdbc:mysql://localhost:3306/uber";
			   String username = "root";
			   String password = "root";
			   Class.forName(driver);
			   
			   Connection conn = (Connection) DriverManager.getConnection(url,username,password);
			   System.out.println("Connected");
			   return conn;
			  } catch(Exception e){System.out.println(e);}
			  
		  return null;
	}
	public static void main(String args[]) throws Exception {
		getConnection();
	}
}
