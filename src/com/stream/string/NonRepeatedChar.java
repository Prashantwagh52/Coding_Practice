package com.stream.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedChar {

	public static void main(String[] args) {

		// Given a String, find the first non-repeated character in it using Stream
		// functions

		String input = "Java jrticles are Awesome";

		Optional<Character> firstNonRepeated = 
				input.toLowerCase()
				.chars() // IntStream of characters
				.filter(ch -> ch != ' ') // ignore spaces
				.mapToObj(c -> (char) c) // convert int to Character
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // maintain Order
				.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst();

//		firstNonRepeated.ifPresentOrElse(c -> System.out.println("First non-repeated character: " + c),
//				() -> System.out.println("No non-repeated character found."));

		if (firstNonRepeated.isPresent()) {
			System.out.println("First non-repeated character: " + firstNonRepeated.get());
		} else {
			System.out.println("No non-repeated character found.");
		}
		
		
		Character repeat = input.toLowerCase()
		     .chars()       //it will return IntStream 
		     .mapToObj(c -> (char) c)  // convert int to Character
		     .collect(Collectors.groupingBy(n ->n , LinkedHashMap::new, Collectors.counting())) // linked hashmap maintain order 
		     .entrySet()
		     .stream()
		     .filter(p -> p.getValue() ==1)
		     .map(p -> p.getKey())
		     .findFirst()
		     .orElse(null);

		System.out.println(repeat);
	}
}
