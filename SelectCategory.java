package uberReciptSystem;

import java.util.Scanner;

public class SelectCategory {
	static char choice;

	void userCategory() {
		System.out.println(":::SELECT YOUR CATEGORY:::");
		System.out.println(" 1. DRIVER    ");
		System.out.println(" 2. PASSENGER ");
		System.out.println(" 3. CORPORATE ");
	}

	void choseCategory(int c, OptionDriver driver, OptionPassenger passenger, OptionCorporate corporate) {

		Scanner sc = new Scanner(System.in);
		switch (c) {
		case 1:
			System.out.println("::WELCOME TO DRIVER DOMAIN::: ");
			driver.inputDetails();
			
			break;
		case 2:
			System.out.println("::WELCOME TO PASSENGER DOMAIN::");
			passenger.tripChoice();
			int x = sc.nextInt();
			passenger.selectTrip(x);
			passenger.rideChoice();
			int a = sc.nextInt();
			passenger.selectRide(driver,a);

			
			break;
		case 3:
			System.out.println("::WELCOME TO CORPORATE DOMAIN::");
			corporate.detailsOption();
			int y = sc.nextInt();
			corporate.displayDetails(y, driver, passenger);
			
			break;
		default: {
			System.out.println("::INVALID ENTRY,PLEASE TRY AGAIN::");

		}
		}
	}
}
