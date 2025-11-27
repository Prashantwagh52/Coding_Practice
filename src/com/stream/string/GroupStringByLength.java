package com.stream.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");

		Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(String::length));

		System.out.println(collect);
	}

}
