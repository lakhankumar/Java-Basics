import java.util.Scanner;

public class Swappnig {

	public static void main(String[] args) {
		int temp;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter x value");
			int x = scan.nextInt();
			System.out.println("enter y value");
			int y = scan.nextInt();
			System.out.println("Before swapping: x = " +x+" and y = " +y);
			
			temp = x;
			x = y;
			y = temp;
			System.out.println("After swapping: x = " +x+" and y = " +y);
		}
	}

}
