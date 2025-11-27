package com.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Find the longest string in a list of strings using Java streams:

public class MaxCharInString {
	public static void main(String[] args) {

		// By Alphabetical
		List<String> list = Arrays.asList("ok", "done", "perfect", "confrim");
		
		Optional<String> max = list.stream().max((s1, s2) -> s1.compareTo(s2));
		max.ifPresent(System.err::println);

		// By Length
		Optional<String> max2 = list.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		max2.ifPresent(System.err::println);

		Optional<String> max3 = list.stream().max(Comparator.comparing(String::length));
		max3.ifPresent(System.err::println);
	}
}
