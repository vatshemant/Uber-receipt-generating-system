package uberReciptSystem;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DbConnect {
	private static final Statement NULL = null;
	static Statement stmt=NULL;
	

	public void UpdateDriverData(OptionDriver driver,OptionPassenger passenger) throws Exception{//Updating data in driver table
		String driver1 = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/uber";
		String username = "root";
		String password = "root";
		Class.forName(driver1);

		Connection conn = (Connection) DriverManager.getConnection(url, username, password);
		stmt = (Statement) conn.createStatement();
	      stmt.executeUpdate("INSERT INTO UberDriver (DriverName,VehicleNumber,DistanceCovered,AmountEarned) VALUES ('"+driver.name+"','"+driver.vehicleNumber+"','"+passenger.distance+"','"+passenger.fare+"')");
	     
	}
	public void UpdatePassengerData(OptionPassenger passenger)throws Exception {//Updating Data in passenger tablr
		String driver1 = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/uber";
		String username = "root";
		String password = "root";
		Class.forName(driver1);

		Connection conn = (Connection) DriverManager.getConnection(url, username, password);
		stmt = (Statement) conn.createStatement();
	      stmt.executeUpdate("INSERT INTO UberPassenger (DriverAlloted,PassengerDestination,RideChosen,DistanceTravelled,AmountPaid) VALUES ('"+passenger.driNum+"','"+passenger.destinationDetails+"','"+passenger.cabDetails+"','"+passenger.distance+"','"+passenger.fare+"')");
	     
		
	}
}
