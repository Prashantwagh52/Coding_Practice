package com.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfSentance {

	public static void main(String[] args) {
		
		List<String> sentences = Arrays.asList(
			    "Java is fun",
			    "I love streams",
			    "FlatMap is powerful"
			);

		List<String> collect = sentences.stream().flatMap(n -> Arrays.stream(n.split(" "))).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
