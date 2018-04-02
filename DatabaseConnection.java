package uberReciptSystem;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DbTableCreate {
	private static final Statement NULL = null;

	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/uber";
			String username = " ";
			String password = " ";
			Class.forName(driver);

			Connection conn = (Connection) DriverManager.getConnection(url, username, password);//Establishing Connection to DATABASE.
			Statement stmt=NULL;
			System.out.println("Connected");
			System.out.println("Creating table in given database...");
		      stmt = (Statement) conn.createStatement();
		      
		      String sql = "CREATE TABLE UberDetails" +
		                   "(DriverName VARCHAR(255), " +
		                   " VehicleNumber INTEGER, " + 
		                   " DistanceCovered INTEGER, " + 
		                   " AmountEarned INTEGER, " + 
		                   " DriverAlloted INTEGER,"+
		                   "PassengerDestination VARCHAR(255),"+
		                   "RideChosen VARCHAR(255),"+
		                   "DistanceTravelled INTEGER,"+
		                   "AmountPaid INTEGER)       "; 
		      stmt.executeUpdate(sql);
		     
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}
	
}


