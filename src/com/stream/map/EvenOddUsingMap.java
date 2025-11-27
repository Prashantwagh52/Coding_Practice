package com.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddUsingMap {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Map<String, List<Integer>> collect = list.stream()
				.collect(Collectors.groupingBy(e -> e % 2 == 0 ? "Even" : "Odd"));

		System.out.println(collect);
	}
}
