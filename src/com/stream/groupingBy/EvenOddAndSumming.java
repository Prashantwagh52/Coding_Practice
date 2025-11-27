package com.stream.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddAndSumming {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 3, 9, 12, 15, 18, 21);

		Map<String, Integer> collect = numbers.stream()
				.collect(Collectors.groupingBy(e -> e % 2 == 0 ? "EVEN" : "ODD", Collectors.summingInt(e -> e)));

		Map<String, List<Integer>> collect2 = numbers.stream()
				.collect(Collectors.groupingBy(n -> n % 2 == 0 ? "EVEN" : "ODD"));

		System.out.println(collect);
		
		System.err.println(collect2);
	}
}
