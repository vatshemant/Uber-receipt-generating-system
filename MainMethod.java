package uberReciptSystem;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SelectCategory option = new SelectCategory();//category class object.
		OptionPassenger passenger = new OptionPassenger();//passenger class object.
		OptionDriver driver = new OptionDriver();//driver class object.
		OptionCorporate corporate = new OptionCorporate();//corporate class object.
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
