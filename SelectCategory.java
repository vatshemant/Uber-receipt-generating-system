package uberReciptSystem;

import java.util.Scanner;

public class SelectCategory {
	char ch;
	int a;

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
			OptionDriver driver = new OptionDriver();
			driver.inputDetails();
			driver.displayDetails();

			System.out.println("DO YOU WANT TO CONTINUE??? (Y/N)");
			ch = sc.next().charAt(0);
			if (ch == 'y') {
				recallMethod(sc);
			} else {
				System.out.println("THANKS,SEE YOU SOON");
				break;
			}

			break;
		case 2:
			System.out.println("::WELCOME TO PASSENGER DOMAIN::");
			OptionPassenger passenger = new OptionPassenger();
			passenger.tripChoice();
			int x = sc.nextInt();
			passenger.selectTrip(x);
			passenger.rideChoice();
			int a = sc.nextInt();
			passenger.selectRide(a);

			System.out.println("DO YOU WANT TO CONTINUE??? (Y/N)");
			ch = sc.next().charAt(0);
			if (ch == 'y') {
				recallMethod(sc);
			} else {
				System.out.println("THANKS,SEE YOU SOON");
				break;
			}

			break;
		case 3:
			System.out.println("::WELCOME TO CORPORATE DOMAIN::");
			OptionCorporate corporate = new OptionCorporate();
			corporate.detailsOption();
			int y = sc.nextInt();
			corporate.displayDetails(y);

			System.out.println("DO YOU WANT TO CONTINUE??? (Y/N)");
			ch = sc.next().charAt(0);
			if (ch == 'y') {
				recallMethod(sc);
			} else {
				System.out.println("THANKS,SEE YOU SOON");
				break;
			}

			break;
		default: {
			System.out.println("::INVALID ENTRY,PLEASE TRY AGAIN::");
			recallMethod(sc);
		}
		}
	}

	private void recallMethod(Scanner sc) {
		SelectCategory category = new SelectCategory();
		category.userCategory();
		int a1 = sc.nextInt();
		category.choseCategory(a1);
	}
}
