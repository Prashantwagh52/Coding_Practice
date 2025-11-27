package com.stream.string;

import java.util.Arrays;
import java.util.List;

public class StringContainWord {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Java", "Stream API", "Lambda");

		boolean anyMatch = list.stream().anyMatch(s -> s.contains("API"));

		System.out.println(anyMatch);
	}

}
