package com.stream.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatinationString {

	// Use Stream API to find the concatenation of the first two words that have
	// even lengths.

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

		String collect = words.stream().filter(e -> e.length() % 2 == 0).limit(2).collect(Collectors.joining());

		String reduce = words.stream().filter(p -> p.length() % 2 == 0).limit(2).reduce("", String::concat);

		System.err.println(reduce + " " + collect);
	}
}
