package com.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpparCaseAndSort {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Prashant", "Amit", "Anjali", "Rahul", "Ajay", "Sneha", "Arun");

		List<String> collect = list.stream().filter(e -> e.startsWith("A")).map(String::toUpperCase).sorted()
				.collect(Collectors.toList());

		System.out.println(collect);
	}
}
