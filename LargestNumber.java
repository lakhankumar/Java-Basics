import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter your three numbers");
			int FirstNum = scan.nextInt();
			int SeconNum = scan.nextInt();
			int ThirsNum = scan.nextInt();
					
			if ((FirstNum>SeconNum) && (FirstNum>ThirsNum)) {
				System.out.println(FirstNum+ " is greater");
			} 
			else if (SeconNum>ThirsNum) {
				System.out.println(SeconNum+ " is greater");
			}
			else {
				System.out.println(ThirsNum+ " is greater");
			}
		}
	}

}
