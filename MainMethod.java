package uberReciptSystem;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SelectCategory option = new SelectCategory();//SELECT CATEGORY OBJECT.
		OptionPassenger passenger = new OptionPassenger();//PASSENGER CLASS OBJECT
		OptionDriver driver = new OptionDriver();//DRIVER CLASS OBJECT
		OptionCorporate corporate = new OptionCorporate();//CORPORATE CLASS OBJECT
		DbConnect connect1=new DbConnect();//DATABASE CLASS OBJECT
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
