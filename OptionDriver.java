package uberReciptSystem;

import java.util.Scanner;

public class OptionDriver {
	OptionPassenger ob = new OptionPassenger();
	String s;
	int no;

	void inputDetails() {
		System.out.println("::::ENTER YOUR DETAILS::::");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		s = sc.nextLine();
		System.out.println("ENTER VEHICLE NUMBER");
		no = sc.nextInt();

	}

	void displayDetails() {
		System.out.println("DRIVER NAME::::::::: " + s);
		System.out.println("VEHICLE NUMBER:::::: " + no);
		System.out.println("DISTANCE TRAVELLED:: " + ob.distance + " kms.");
		System.out.println("AMOUNT EARNED::::::: " + ob.fare + " Rupees.");

	}

}
