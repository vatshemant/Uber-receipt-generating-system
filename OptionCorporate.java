package uberReciptSystem;

import java.util.Scanner;

public class OptionCorporate {
	Scanner sc = new Scanner(System.in);

	void detailsOption() {
		System.out.println(":::::CHOSE THE OPTION TO SEE THE DETAILS:::::");
		System.out.println(" 1. DRIVER ");
		System.out.println(" 2. PASSENGER");
	}

	void displayDetails(int x, OptionDriver driver, OptionPassenger passenger) {
		switch (x) {
		case 1:
			System.out.println("::::DRIVER DETAILS ARE AS FOLLOWS::::");
			driver.driverlist(driver,passenger);
			break;
		case 2:
			System.out.println("::::PASSENGER DETAILS ARE AS FOLLOWS::::");
			break;
		default: {
			System.out.println("::::INVALID ENTRY::::");

		}
		}
	}
}
