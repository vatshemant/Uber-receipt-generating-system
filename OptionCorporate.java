package uberReciptSystem;

import java.util.Scanner;

public class OptionCorporate {
	Scanner sc = new Scanner(System.in);

	void detailsOption() {
		System.out.println(":::::CHOSE THE OPTION TO SEE THE DETAILS:::::");
		System.out.println(" 1. DRIVER ");
		System.out.println(" 2. PASSENGER");
	}

	void displayDetails(int x, OptionDriver driver, OptionPassenger passenger) {//Display Function.
		switch (x) {
		case 1:
			System.out.println("::::DRIVER DETAILS ARE AS FOLLOWS::::");
			driver.driverList(driver, passenger);//Calling Driver List Function to Display Driver Details.
			break;
		case 2:
			System.out.println("::::PASSENGER DETAILS ARE AS FOLLOWS::::");
			passenger.passengerList(passenger);//Calling Passenger List Function to Display Passenger Details.
			break;
		default: {
			System.out.println("::::INVALID ENTRY::::");
		}
		}
	}
}
