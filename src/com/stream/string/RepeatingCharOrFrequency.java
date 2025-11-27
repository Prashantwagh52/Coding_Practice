package com.stream.string;

public class RepeatingCharOrFrequency {

	public static void main(String[] args) {

		String s = "prashant";

		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] == 0) {
				continue;
			}

			int count = 1;

			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					count = count + 1;
					charArray[j] = 0;
				}
			}
			System.out.println(charArray[i] + " : " + count);
		}
	}
}
