package com.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingAndEndingSameLetter {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Anna", "Bob", "Alice", "Steve", "Otto", "Eve");

		List<String> sameName = names.stream().map(String::toUpperCase)
				                      .filter(e -> e.charAt(0) == e.charAt(e.length() - 1))
				                      .sorted().collect(Collectors.toList());

		System.out.println(sameName);
	}
}
