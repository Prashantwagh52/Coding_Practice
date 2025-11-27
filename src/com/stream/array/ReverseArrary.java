package com.stream.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrary {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 55 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.err.println(arr[i]);
		}

		List<Integer> list = Arrays.asList(1, 2, 3);

		Collections.reverse(list);
	}
}
