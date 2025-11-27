package com.stream.string;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatchingElement {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "cherry", "blueberry");

		List<String> b = words.stream().filter(e -> e.startsWith("b")).collect(Collectors.toList());

		b.forEach(e -> System.err.println("First word starting with 'b': " + e));

	}
}
