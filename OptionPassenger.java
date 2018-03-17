package uberReciptSystem;

import java.util.Scanner;

public class OptionPassenger {

	Scanner sc = new Scanner(System.in);
	int distance;
	int fare;

	void tripChoice() {
		System.out.println(":::SELECT YOUR TRIP:::");
		System.out.println("1. DELHI TO CHANDIGARH");
		System.out.println("2. DELHI TO FARIDABAD");
		System.out.println("3. DELHI TO MODINAGAR");
	}

	void selectTrip(int x) {
		switch (x) {
		case 1:
			System.out.println("YOUR TRIP IS FROM DELHI TO CHANDIGARH ,SELECT YOUR RIDE");
			distance = 360;
			break;
		case 2:
			System.out.println("YOUR TRIP IS FROM DELHI TO FARIDABAD ,SELECT YOUR RIDE");
			distance = 36;
			break;
		case 3:
			System.out.println("YOUR TRIP IS FROM DELHI TO MODINAGAR ,SELECT YOUR RIDE");
			distance = 74;
			break;
		default: {
			System.out.println("WRONG ENTRY PLEASE TRY AGAIN");
			recallMethod();
		}
		}
	}

	private void recallMethod() {
		SelectCategory category = new SelectCategory();
		category.userCategory();
		int a = sc.nextInt();
		category.choseCategory(a);
	}

	void rideChoice() {
		System.out.println("1. UberGO");
		System.out.println("2. UberX");
		System.out.println("3. UberXL");
	}

	void selectRide(int y) {

		switch (y) {
		case 1:
			fare = distance * 8;
			System.out.println("YOU HAVE CHOSEN UberGO,YOUR FARE DETAILS ARE::");
			System.out.println("DISTANCE TRAVELLED: " + distance + "kms ");
			System.out.println("FARE IS:: " + fare);
			break;
		case 2:
			fare = distance * 12;
			System.out.println("YOU HAVE CHOSEN UberX,YOUR FARE DETAILS ARE::");
			System.out.println("DISTANCE TRAVELLED: " + distance + "kms ");
			System.out.println("FARE IS:: " + fare);
			break;

		case 3:
			fare = distance * 15;
			System.out.println("YOU HAVE CHOSEN UberXL,YOUR FARE DETAILS ARE::");
			System.out.println("DISTANCE TRAVELLED: " + distance + "kms ");
			System.out.println("FARE IS:: " + fare);
			break;
		default: {
			System.out.println("INVALID ENTRY");
			recallMethod();
		}
		}
	}

}
