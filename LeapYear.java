import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter your number");
			int num = scan.nextInt();
			if(num>999) {
				if ( (num%400 == 0) || (num%4 == 0) && (num%100 != 0)) {
					System.out.println("Its leap year");
				}
				else
					System.out.println("Its not leap year");
			}
			else
				System.out.println("invalid year");
		}
	}

}
