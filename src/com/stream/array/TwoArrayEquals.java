package com.stream.array;
import java.util.Arrays;

public class TwoArrayEquals {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 4, 3, 2 };

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		boolean arr = Arrays.equals(arr1, arr2);

		System.err.println(arr);
	}
}
