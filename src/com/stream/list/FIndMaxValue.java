package com.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FIndMaxValue {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		OptionalInt max = myList.stream().mapToInt(Integer::intValue).max();
		
		Optional<Integer> max2 = myList.stream().max(Integer::compareTo);

		System.err.println(max);

	}
}
