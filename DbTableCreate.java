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
			String username = "root";
			String password = "root";
			Class.forName(driver);

			Connection conn = (Connection) DriverManager.getConnection(url, username, password);//Establishing Connection to DATABASE.
			Statement stmt=NULL;
			System.out.println("Connected");
			System.out.println("Creating table in given database...");
		      stmt = (Statement) conn.createStatement();
		      //TABLE FOR DRIVER DETAILS.
		      String sql = "CREATE TABLE UberDriver" +
		                   "(DriverName VARCHAR(255), " +
		                   " VehicleNumber INTEGER, " + 
		                   " DistanceCovered INTEGER,"+
		                   " AmountEarned INTEGER) " ;
		                stmt.executeUpdate(sql);
			//TABLE FOR PASSENGER DETAILS.
			String sql1 = "CREATE TABLE UberPassenger"+
		                   "(DriverAlloted INTEGER,"+
		                   "PassengerDestination VARCHAR(255),"+
		                   "RideChosen VARCHAR(255),"+
		                   "DistanceTravelled INTEGER,"+
		                   "AmountPaid INTEGER)       "; 
			        stmt.executeUpdate(sql1);
			
		     
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}
	/*public static void main(String args[]) throws Exception {
		getConnection();*/
}

