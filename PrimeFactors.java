
public class PrimeFactors {

	public static void main(String[] args) {
		PrimeFactors obj = new PrimeFactors();
		boolean prime = obj.isPrime(24);
		System.out.println(prime);
	}
 public boolean isPrime(int Num) {
	 int count = 0;
	 boolean flag=false;
	for (int i = 2; i < Num; i++) {
		if (Num%i == 0) {
			count++;
		}
	}
	if (count == 0) {
		flag=true;
	} else {
		flag=false;
	}
	return flag;
 }
 public void primeFactor(int Num) {
	 for (int)
 }
}
