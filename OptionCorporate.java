package uberReciptSystem;

public class OptionCorporate {
	void detailsOption() {
		System.out.println(":::::CHOSE THE OPTION TO SEE THE DETAILS:::::");
		System.out.println(" 1. DRIVER ");
		System.out.println(" 2. PASSENGER");
	}

	void displayDetails(int x) {
		switch (x) {
		case 1:
			System.out.println("::::DRIVER DETAILS ARE AS FOLLOWS::::");
			OptionDriver ob = new OptionDriver();
			ob.displayDetails();
			break;
		case 2:
			System.out.println("::::PASSENGER DETAILS ARE AS FOLLOWS::::");
			break;
		default:
			System.out.println("::::INVALID ENTRY::::");

		}
	}
}
