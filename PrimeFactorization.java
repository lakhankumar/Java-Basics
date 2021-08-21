import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		factorical(num);
	}

	private static void factorical(int num) {
		System.out.print("prime factors of " +num+ " are: ");
		for (int i = 2; i < num; i++) {
			while (num%i == 0) {
				System.out.print(i+ ",");
				num/=i;
			}
		}
		if (num > 2) {
			System.out.println(num);
		}
	}

}
