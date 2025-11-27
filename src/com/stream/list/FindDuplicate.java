package com.stream.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 15, 8);

		Set<Integer> set = new HashSet<>();

		List<Integer> collect = numbers.stream().filter(a -> !set.add(a)).collect(Collectors.toList());

		System.out.println(collect);
	}
}
