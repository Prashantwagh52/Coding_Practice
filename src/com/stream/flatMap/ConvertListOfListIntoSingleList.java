package com.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfListIntoSingleList {

	public static void main(String[] args) {
		
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8, 9)
			);

		List<Integer> collect = numbers.stream().
										flatMap(n -> n.stream())
										.collect(Collectors.toList());
		
		System.err.println(collect);
	}
}
