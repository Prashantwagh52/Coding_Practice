package com.stream.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 5, 2, 7, 2, 8, 11, 3);

		List<Integer> collect = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.err.println(collect);
	}

}
