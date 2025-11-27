package com.stream.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertStringsIntoMap {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Java", "Stream", "API");

		Map<String, Integer> collect = words.stream().collect(Collectors.toMap(n -> n, String::length));

		System.err.println(collect);
	}
}
