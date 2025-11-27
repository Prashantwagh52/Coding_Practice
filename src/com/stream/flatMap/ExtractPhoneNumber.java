package com.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.stream.practice.FlatMapEmployee;

public class ExtractPhoneNumber {
	
	public static void main(String[] args) {
		
		
		List<FlatMapEmployee> employees = Arrays.asList(
			    new FlatMapEmployee("Alice", Arrays.asList("123", "456")),
			    new FlatMapEmployee("Bob", Arrays.asList("789")),
			    new FlatMapEmployee("Charlie", Arrays.asList("111", "222", "333"))
			);
		
		
		List<String> collect = employees.stream().flatMap(e -> e.getPhoneNumbers().stream()).collect(Collectors.toList());
		
		System.err.println(collect);
	}

	
	
	
}
