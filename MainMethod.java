package uberReciptSystem;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SelectCategory option = new SelectCategory();//Category Class object.
		OptionPassenger passenger = new OptionPassenger();//Passenger Class Object.
		OptionDriver driver = new OptionDriver();//Driver Class Object.
		OptionCorporate corporate = new OptionCorporate();//Corporate Class Object.
		DbConnect connect1=new DbConnect();
		while (true) {
			option.userCategory();
			int c = sc.nextInt();
			option.choseCategory(c, driver, passenger, corporate);
			connect1.UpdateDriverData(driver,passenger);
			connect1.UpdatePassengerData(passenger);
			System.out.println(":::DO YOU WANT TO QUIT (Y/N) :::");
			char ch;
			ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				break;
			}
		}
	}
}
