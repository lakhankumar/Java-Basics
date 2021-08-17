import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		float Harmonic=0;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter your nth number");
			int Num=scan.nextInt();
			for (int i = 1; i < Num; i++) {
				Harmonic += (float) 1/Num;
				System.out.println(Harmonic);
			}
		}
	}

}
