
public class Swapping {

	public static void main(String[] args) {

		int a = 10, b = 20;

		System.err.println("Before Swapping a=" + a + " b= " + b);

		a = a + b; // int = a;
		b = a - b; // a= b;
		a = a - b; // b= temp;

		System.err.println("After Swapping a=" + a + " b= " + b);
	}
}
