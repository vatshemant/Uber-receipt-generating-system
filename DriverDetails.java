package uberReciptSystem;
import java.util.Scanner;
public class DriverDetails {
	String s;
	int no;
	int trips;
	int earning;
	void inputDetails() {
		System.out.println("ENTER YOUR DETAILS");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		 s=sc.nextLine();
		System.out.println("ENTER VEHICLE NUMBER");
		 no=sc.nextInt();
		System.out.println("ENTER NUMBER OF TRIPS");
		trips=sc.nextInt();
		System.out.println("ENTER AMOUNT EARNED");
		earning=sc.nextInt();
	}
	void displayDetails() {
		System.out.println("DRIVER NAME::::: "+s);
		System.out.println("VEHICLE NUMBER:: "+no);
		System.out.println("TOTAL TRIPS::::: "+trips);
		System.out.println("TOTAL EARNINGS:: "+earning);
	}
public static void main(String[] args) {
	DriverDetails ob=new DriverDetails();
	ob.inputDetails();
	ob.displayDetails();
}
}
