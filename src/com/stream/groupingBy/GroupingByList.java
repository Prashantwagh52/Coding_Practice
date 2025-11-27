package com.stream.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByList {

	// Group By Name first letter.

	public static void main(String[] args) {

		List<String> names = Arrays.asList("prashant", "rohan", "amit", "ramesh", "priya", "pooja", "anita");

		Map<Character, List<String>> collect = names.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));

		collect.forEach((a, b) -> {

			System.err.println(a + " " + b);
		});
	}
}
