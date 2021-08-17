import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
//		flagging
		int flag=0;
//		scanner
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter your number");
			int Number = scan.nextInt();
			int m = Number/2;

			if (Number == 0 || Number == 1) {
				System.out.println("is not a prime");
			}
			else {
//				for loop
				for (int i = 2; i <=m; i++) {
					if (Number%i == 0) {
						System.out.println("not a prime");
						flag=1;
						break;
					}
					else {
						if (flag == 0) {
							System.out.println("prime");
						}
					}
				}
			}
		}
	}
}
