package com.stream.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSortingbyKeyAndValue {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("prashant", 99);
		map.put("abc", 1);
		map.put("zjs", 56);
		map.put("sd", 56);

		List<Entry<String, Integer>> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());

		collect.forEach(System.out::println);

	}

}
