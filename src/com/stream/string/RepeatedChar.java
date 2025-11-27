package com.stream.string;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class RepeatedChar {

	public static void main(String[] args) {

		// Given a String, find the first repeated character in it using Stream
		// functions?
		
		String input = "Java Articles are Awesome";
		
		
	Character pp= 	input.toLowerCase()
		     .chars()
		     .mapToObj(c -> (char)c)
		     .collect(Collectors.groupingBy(n -> n , LinkedHashMap::new , Collectors.counting()))
		     .entrySet()
		     .stream()
		     .filter(x -> x.getValue() == 1)
		     .map(m -> m.getKey())
		     .findFirst()
		     .orElse(null);
	
	System.out.println(pp);
		     
	}
}
