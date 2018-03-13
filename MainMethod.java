package uberReciptSystem;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SelectCategory option = new SelectCategory();
		option.userCategory();
		int c = sc.nextInt();
		option.choseCategory(c);
	}

}
