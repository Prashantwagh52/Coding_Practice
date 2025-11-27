package com.stream.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FilterTheMap {

	public static void main(String[] args) {

		// Question: Given a map, filter entries with values greater than 10 and collect
		// keys into a list.

		// NOTE : WE HAVE TO PRINT KEYS NOT VALUE
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 5);
		map.put("B", 15);
		map.put("C", 10);
		map.put("D", 20);

		// this print/Return key and value 
		List<Entry<String, Integer>> collect = map.entrySet().stream().filter(e -> e.getValue() > 10)
				.collect(Collectors.toList());

		System.out.println(collect);

		// this print key
		
		// Goal of .map()
		// .map() is used to transform each element in the stream to another object.
		// Current stream elements: Map.Entry<String, Integer>
		// Target: String (the key).

		List<String> collect2 = map.entrySet().stream()
					                           .filter(e -> e.getValue() > 10)
					                           .map(Map.Entry::getKey)
					                           .collect(Collectors.toList());
		
		System.out.println(collect2);

	}
}
