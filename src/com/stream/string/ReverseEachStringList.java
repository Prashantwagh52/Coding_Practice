package com.stream.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachStringList {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Java", "Stream", "API", "Development");

		List<String> collect = words.stream()
				                    .map(word -> new StringBuilder(word).reverse().toString())
				                     .collect(Collectors.toList());

		System.out.println(collect);
	}
}
