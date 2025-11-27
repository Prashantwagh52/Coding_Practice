
public class PrimeNo {

	public static boolean prime(int no) {
		if (no <= 1) {
			return false;
		}

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int n = 10;
		System.err.println(prime(n));
	}
}
