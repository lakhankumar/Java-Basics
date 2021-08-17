import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
//		int dividend = 16, divisor = 4;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter dividend");
			int dividend = scan.nextInt();
			System.out.println("Enter divisor");
			int divisor = scan.nextInt();
			float quotient = (float) dividend / divisor;
			int remainder = dividend % divisor;

			System.out.println("Quotient = " + quotient);
			System.out.println("Remainder = " + remainder);
		}
	  
	}

}
