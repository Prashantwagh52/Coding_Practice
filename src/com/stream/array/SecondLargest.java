package com.stream.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 5, 30, 25 };

		Optional<Integer> first = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();

		first.ifPresent(e -> {
			System.err.println(e);
		});

		List<Integer> list = Arrays.asList(1, 2, 34, 6456, 23);

		Integer orElse = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

	}
}
