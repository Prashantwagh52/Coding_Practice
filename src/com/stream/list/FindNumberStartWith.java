package com.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumberStartWith {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 132);

		List<String> collect = myList.stream().map(e -> e + "").filter(e -> e.startsWith("1"))
				.collect(Collectors.toList());

		System.out.println(collect);
	}
}
