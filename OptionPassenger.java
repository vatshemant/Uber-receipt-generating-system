package uberReciptSystem;

import java.util.Scanner;

public class OptionPassenger {
	Scanner sc = new Scanner(System.in);
	int distance = 0;
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
			break;
		case 2:
			System.out.println("YOUR TRIP IS FROM DELHI TO FARIDABAD ,SELECT YOUR RIDE");
			break;
		case 3:
			System.out.println("YOUR TRIP IS FROM DELHI TO MODINAGAR ,SELECT YOUR RIDE");
			break;
		default: {
			System.out.println("WRONG ENTRY PLEASE TRY AGAIN");
			recallMethod();
		}
		}

		if (x == 1) {
			distance = 360;
		} else if (x == 2) {
			distance = 36;
		} else if (x == 3) {
			distance = 74;
		}
	}

	private void recallMethod() {//Method to recall SelectCategory class.
		SelectCategory option = new SelectCategory();
		option.userCategory();
		int a = sc.nextInt();
		option.choseCategory(a);
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
