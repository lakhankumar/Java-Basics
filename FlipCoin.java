import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int head=0;
		int tail=0;
		double Headpercentage,Tailpercentage;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("How many times you want to flip the coin");
			int Times = scan.nextInt();
			for (int i = 0; i < Times; i++) {
				int flip = (int) Math.floor(Math.random()*10)%2;
				if (flip == 1) {
					System.out.println("It's head");
					head+=1;
				}
				else {
					System.out.println("It's tail");
					tail+=1;
				}
			}
			System.out.println(head);
			System.out.println(tail);
			
			Headpercentage=(head*100)/Times;
			System.out.println(Headpercentage);
			Tailpercentage=(tail*100)/Times;
			System.out.println(Tailpercentage);
		}
	}
}
