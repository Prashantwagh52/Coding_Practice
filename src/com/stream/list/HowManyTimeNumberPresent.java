package com.stream.list;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class HowManyTimeNumberPresent {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1, 4, 5, 0, 2, 4 };

		Map<Integer, Long> collect = Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		System.out.println(collect);

	}
}
