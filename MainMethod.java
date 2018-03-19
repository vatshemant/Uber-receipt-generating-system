package uberReciptSystem;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SelectCategory option = new SelectCategory();
		OptionPassenger passenger = new OptionPassenger();
		OptionDriver driver = new OptionDriver();
		OptionCorporate corporate = new OptionCorporate();
		while (!false) {
			option.userCategory();
			int c = sc.nextInt();
			if (c == 4) {
				break;
			}
			option.userCategory();
			option.choseCategory(c, driver, passenger, corporate);
		}
	}
}