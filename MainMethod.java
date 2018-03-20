package uberReciptSystem;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SelectCategory option = new SelectCategory();//Select Category Class Object.
		OptionPassenger passenger = new OptionPassenger();//Passenger Class Object.
		OptionDriver driver = new OptionDriver();//Driver Class Object.
		OptionCorporate corporate = new OptionCorporate();//Corporate Class Object.
		while (!false) {
			option.userCategory();
			int c = sc.nextInt();
			if (c == 4) {
				break;
			}
			option.userCategory();
			option.choseCategory(c, driver, passenger, corporate);//Passing objects in Chose Category Function.
		}
	}
}
