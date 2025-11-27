package com.dsa;

public class PalindromeString {

	public static Boolean palindrome(String str) {
		int left = 0, right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static Boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	public static void main(String[] args) {
		System.out.println(palindrome("madam"));
		System.err.println(isPalindrome("madam"));
	}
}
