package uberReciptSystem;
import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SelectCategory option = new SelectCategory();
		OptionPassenger passenger = new OptionPassenger();
		OptionDriver driver = new OptionDriver();
		OptionCorporate corporate = new OptionCorporate();
		 while(true){
			option.userCategory();
			int c = sc.nextInt();
			
			option.choseCategory(c, driver, passenger, corporate);
			System.out.println(":::DO YOU WANT TO QUIT (Y/N) :::");
			char ch;
			ch=sc.next().charAt(0);
			if(ch=='n'||ch=='N') {
				break;
			}
		}
	}
}
