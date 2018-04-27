package uberReciptSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class OptionDriver {

	String name;
	int vehicleNumber;

	void inputDetails() {
		System.out.println("::::ENTER YOUR DETAILS::::");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		name = sc.nextLine();
		System.out.println("ENTER VEHICLE NUMBER");
		vehicleNumber = sc.nextInt();
	}

	Random rand=new Random();
	int driverNumber=rand.nextInt(10);
	

	public void driverList(OptionDriver driver, OptionPassenger passenger) {

		ArrayList driverlist = new ArrayList();
		driverlist.add("Driver Name");
		driverlist.add(driver.name);
		driverlist.add("Vehicle Number");
		driverlist.add(driver.vehicleNumber);
		driverlist.add("Distance Covered");
		driverlist.add(passenger.distance);
		driverlist.add("Amount Earned");
		driverlist.add(passenger.fare);

		Iterator itr = driverlist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
