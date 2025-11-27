package com.stream.string;

public class ReverseString {

	public String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {

		String input = "Done Sir";
		ReverseString string = new ReverseString();
		System.out.println(string.reverse(input));

		String str = "Hello";
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		 System.err.println("Reversed String: " + reversed);
	}
}
