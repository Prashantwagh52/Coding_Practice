
public class Palindorme {

	public static void main(String[] args) {

		int number = 121;
		int originalNo = number;
		int rev = 0;

		while (number != 0) {
 
			int a = number % 10;  // Get last digit
			rev = rev * 10 + a;   // Append digit
			number = number / 10;  // Remove last digit
		}

		if (originalNo == rev) {
			System.out.println(originalNo + " is a palindrome number");
		} else {
			System.out.println(originalNo + " is not a palindrome number");
		}

	}
}
