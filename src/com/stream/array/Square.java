package com.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Use Stream API to square each number in the list and collect the result into a new list

public class Square {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		numbers.stream().map(e -> e * e).collect(Collectors.toList()).forEach(System.out::println);
	}
}
