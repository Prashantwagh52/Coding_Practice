package com.stream.string;

public class DuplicateCharInString {

	public static void duplicate(String s) {

		char[] str = s.toCharArray();

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j]) {
					System.err.println(str[i]);

				}
			}

		}
	}

	public static void main(String[] args) {

		String s = "Programming";
		duplicate(s);

	}
}
