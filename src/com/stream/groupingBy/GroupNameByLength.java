package com.stream.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNameByLength {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("John", "Jack","Jack", "Jill", "Sam", "Sita","Sam", "Shyam");

		//base on length 
		Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(String::length));
		
		
		//how many type one word there or repeat
		Map<String, Long> collect2 = names.stream().collect(Collectors.groupingBy(b -> b ,Collectors.counting()));
		
		

		collect2.forEach((a, b) -> {
			System.err.println(a + " " + b);
		});
	}
}
