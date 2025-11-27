package com.dsa;

public class SecondHighest {

	public static int findSecondHighest(int[] arr) {

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > highest) {
				secondHighest = highest;
				highest = num;
			} else if (num > secondHighest && num != highest) {
				secondHighest = num;
			}

		}
		return secondHighest;
	}
}
