package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaximumFrequency {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 2, 2, 3, 3);

		Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		Integer key = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

		System.err.println(key);
	}
}
