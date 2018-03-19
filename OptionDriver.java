package uberReciptSystem;

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

	void displayDetails(OptionPassenger passenger) {
		System.out.println("DRIVER NAME::::::::: " + name);
		System.out.println("VEHICLE NUMBER:::::: " + vehicleNumber);
		System.out.println("DISTANCE TRAVELLED:: " + passenger.distance + " kms.");
		System.out.println("AMOUNT EARNED::::::: " + passenger.fare + " Rupees.");

	}

}
