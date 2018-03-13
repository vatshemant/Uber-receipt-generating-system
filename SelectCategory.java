package uberReciptSystem;

import java.util.Scanner;

public class SelectCategory {
	void userCategory() {
		System.out.println(":::SELECT YOUR CATEGORY:::");
		System.out.println(" 1. DRIVER    ");
		System.out.println(" 2. PASSENGER ");
		System.out.println(" 3. CORPORATE ");
	}

	void choseCategory(int c) {
		Scanner sc = new Scanner(System.in);
		switch (c) {
		case 1:
			System.out.println("::WELCOME TO DRIVER DOMAIN::: ");
			OptionDriver ob = new OptionDriver();
			ob.inputDetails();
			ob.displayDetails();
			break;

		case 2:
			System.out.println("::WELCOME TO PASSENGER DOMAIN::");
			OptionPassenger ob1 = new OptionPassenger();
			ob1.tripChoice();
			int x = sc.nextInt();
			ob1.selectTrip(x);
			ob1.rideChoice();
			int a = sc.nextInt();
			ob1.selectRide(a);

			break;
		case 3:
			System.out.println("::WELCOME TO CORPORATE DOMAIN::");
			OptionCorporate ob2 = new OptionCorporate();
			ob2.detailsOption();
			int y = sc.nextInt();
			ob2.displayDetails(y);
			break;

		default:
			System.out.println("::INVALID ENTRY,PLEASE TRY AGAIN::");
		}
	}
}
