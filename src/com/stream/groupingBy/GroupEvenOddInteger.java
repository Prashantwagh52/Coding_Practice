package com.stream.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEvenOddInteger {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Map<String, List<Integer>> collect = numbers.stream()
				.collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));

		collect.forEach((a, b) -> {
			System.err.println(a + " " + b);
		});
	}
}
