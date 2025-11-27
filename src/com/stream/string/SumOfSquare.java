package com.stream.string;

import java.util.Arrays;
import java.util.List;

public class SumOfSquare {

	// Use Stream API to find the sum of the squares of even numbers in the list.

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Integer reduce = numbers.stream()
				.filter(e -> e % 2 == 0)
				.map(p -> p * p)
				.reduce(0, (a, b) -> a + b);

		System.err.println(reduce);
		
/////////////////////////////////////////////////////////////////////////////////////////////////
		
		int sum = numbers.stream().
				     filter(e -> e % 2 ==0)
		             .mapToInt(p -> p * p ) 
		             .sum();
		System.err.println("Sum Of Suqre Using primitive is :" + sum);

	}
}
