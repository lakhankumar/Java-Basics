import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of rows and column");
		int Row = scan.nextInt();
		int Column = scan.nextInt();
		int [][] arr = new int[Row][Column];
		System.out.println("enter elements of an array");
		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < Column; j++) {
				arr[i][j] = scan.nextInt();
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
}
