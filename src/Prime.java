
public class Prime {

	public static void main(String[] args) {

		int n = 4;
		int flag = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = 1;

			}
		}
		if (flag == 0) {
			System.err.println("number is prime");
		} else {
			System.err.println("number is not prime");
		}
	}
}
