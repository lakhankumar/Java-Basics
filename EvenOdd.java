import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter your number");
			int Number = scan.nextInt();
			if (Number%2 == 0) {
				System.out.println(Number+ " is Even");
			}
			else
				System.out.println(Number+ "is odd");
		}
	}

}
