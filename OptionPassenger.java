package uberReciptSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OptionPassenger {

	Scanner sc = new Scanner(System.in);
	int distance;
	int fare;
	String destinationDetails;
	String cabDetails;

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
			destinationDetails = "DELHI TO CHANDIGARH";
			break;
		case 2:
			System.out.println("YOUR TRIP IS FROM DELHI TO FARIDABAD ,SELECT YOUR RIDE");
			distance = 36;
			destinationDetails = "DELHI TO FARIDABAD";
			break;
		case 3:
			System.out.println("YOUR TRIP IS FROM DELHI TO MODINAGAR ,SELECT YOUR RIDE");
			distance = 74;
			destinationDetails = "DELHI TO MODINAGAR";
			break;
		default: {
			System.out.println("WRONG ENTRY PLEASE TRY AGAIN");
			break;
		}

		}
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
			cabDetails = "UberGO";
			break;
		case 2:
			fare = distance * 12;
			System.out.println("YOU HAVE CHOSEN UberX,YOUR FARE DETAILS ARE::");
			System.out.println("DISTANCE TRAVELLED: " + distance + "kms ");
			System.out.println("FARE IS:: " + fare);
			cabDetails = "UberX";
			break;

		case 3:
			fare = distance * 15;
			System.out.println("YOU HAVE CHOSEN UberXL,YOUR FARE DETAILS ARE::");
			System.out.println("DISTANCE TRAVELLED: " + distance + "kms ");
			System.out.println("FARE IS:: " + fare);
			cabDetails = "UberXL";
			break;
		default: {
			System.out.println("INVALID ENTRY");
			break;
		}
		}

	}
	public void passengerList(OptionPassenger passenger) {
		ArrayList passengerlist = new ArrayList();
		passengerlist.add("Passenger Destination");
		passengerlist.add(passenger.destinationDetails);
		passengerlist.add("Ride Chosen");
		passengerlist.add(passenger.cabDetails);
		passengerlist.add("Distance Covered");
		passengerlist.add(passenger.distance);
		passengerlist.add("Amount Paid");
		passengerlist.add(passenger.fare);

		Iterator itr = passengerlist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
