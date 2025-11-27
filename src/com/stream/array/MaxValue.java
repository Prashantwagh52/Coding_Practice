package com.stream.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxValue {

	// Given a list of integers, find the maximum value element present in it using
	// Stream functions

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		int[] arr = { 10, 15, 8, 49, 25, 998, 98, 32, 15 };
		
		String[] arr1 = { "apple", "banana", "orange", "mango" };

		Optional<Integer> max = myList.stream().max(Integer::compareTo);

		Optional<Integer> max2 = myList.stream().max(Comparator.naturalOrder());

		Optional<Integer> max3 = Arrays.stream(arr).boxed().max(Integer::compareTo);
		
		Optional<String> max4 = Arrays.stream(arr1).max(Comparator.comparingInt(String::length));
		
		 OptionalInt max5 = myList.stream().mapToInt(Integer::intValue).max();
		
		System.out.println(max2);
		
		System.out.println(max5);

//		max3.ifPresent(e -> {
//			System.err.println(e);
//		});

	}
}
