import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		int Power=1;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter your number");
			int N = scan.nextInt();
			while(N>0 && N<31) {
				for (int i = 0; i <= N; i++) {
					Power=2*Power;
					System.out.println(Power);
				}
			}
		}
		
	}

}
