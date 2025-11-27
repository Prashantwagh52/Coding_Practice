package com.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEachElement {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		
		Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(n -> n , Collectors.counting()));
		
		System.out.println(collect);
	}

}
