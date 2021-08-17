import java.util.Scanner;

public class VowelsOrConsonant {

	public static void main(String[] args) {
		String[] vowels = {"a", "e", "i", "o", "u"};
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter your alphabet");
			String alphabet = scan.nextLine();
			for (int j = 0; j < vowels.length;j++) {
				if (alphabet.equals(vowels[j])) {
					System.out.println(alphabet+ " is vowels");
					break;
				}
				else
					System.out.println(alphabet+ " is a consonant");
					break;
			}
		}
	}

}
