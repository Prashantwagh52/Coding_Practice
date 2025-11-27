package com.stream.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 9, 2, 8, 1, 6, 3, 7);

		Integer integer = numbers.stream()
		        .distinct()
		        .sorted(Comparator.reverseOrder())
		        .skip(1)
		        .findFirst()
		         .orElse(null);
		
		System.out.println(integer);
		
		Integer integer1 = numbers.stream()
		        .distinct()
		        .sorted()
		        .skip(1)
		        .findFirst()
		         .orElse(null);
		
		System.out.println(integer1);
	}

}
