package uberReciptSystem;

import java.util.Scanner;

public class SelectTrip {
	static int x;

	void tripChoice() {
		System.out.println(":::SELECT YOUR TRIP:::");
		System.out.println("1. DELHI TO CHANDIGARH");
		System.out.println("2. DELHI TO FARIDABAD");
		System.out.println("3. DELHI TO MODINAGAR");
	}

	void selectTrip() {
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
		default:
			System.out.println("WRONG ENTRY PLEASE TRY AGAIN");
		}
	}

	void rideChoice() {
		System.out.println("1.UberGO");
		System.out.println("2.UberX");
		System.out.println("3.UberXL");
	}

	void selectRide(int y) {

		int distance = 0;
		distance = specifyDistance(distance);

		switch (y) {
		case 1:
			System.out.println("YOU HAVE CHOSEN UberGO,YOUR FARE DETAILS ARE::");
			System.out.println("DISTANCE TRAVELLED: " + distance + "kms ");
			System.out.println("FARE IS:: " + distance * 8);
			break;
		case 2:
			System.out.println("YOU HAVE CHOSEN UberX,YOUR FARE DETAILS ARE::");
			System.out.println("DISTANCE TRAVELLED: " + distance + "kms ");
			System.out.println("FARE IS:: " + distance * 12);
			break;

		case 3:
			System.out.println("YOU HAVE CHOSEN UberXL,YOUR FARE DETAILS ARE::");
			System.out.println("DISTANCE TRAVELLED: " + distance + "kms ");
			System.out.println("FARE IS:: " + distance * 15);
			break;
		default:
			System.out.println("INVALID ENTRY");
		}
	}

	private int specifyDistance(int distance) {
		if (x == 1) {
			distance = 360;
		} else if (x == 2) {
			distance = 36;
		} else if (x == 3) {
			distance = 74;
		}
		return distance;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SelectTrip ob1 = new SelectTrip();
		ob1.tripChoice();
		x = sc.nextInt();
		ob1.selectTrip();
		SelectTrip ob2 = new SelectTrip();
		ob2.rideChoice();
		int a = sc.nextInt();
		ob2.selectRide(a);
	}

}
