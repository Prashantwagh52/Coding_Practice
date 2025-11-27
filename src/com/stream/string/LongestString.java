package com.stream.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

//Use Stream API to find the length of the longest name in the list.

public class LongestString {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

		Integer orElse = names.stream().map(String::length).max(Integer::compareTo).orElse(0);

		OptionalInt max = names.stream().mapToInt(String::length).max();

		Optional<String> max2 = names.stream().max(Comparator.comparing(String::length));

		System.out.println(max2);

		if (max2.isPresent()) {
			System.out.println(max2.get().length());
		}

		System.err.println(orElse);
	}
}
