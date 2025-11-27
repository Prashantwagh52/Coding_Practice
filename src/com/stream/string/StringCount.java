package com.stream.string;

import java.util.Arrays;
import java.util.List;

//Use Stream API to count the total number of distinct words (case-insensitive) in all the sentences

public class StringCount {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
				"Java Stream API provides a fluent interface for processing sequences of elements.",
				"It supports functional-style operations on streams of elements, such as map-reduce transformations.",
				"In this exercise, you need to count the total number of words in all sentences.");

		long distinctWordCount = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\W+"))) 
                .map(String::toLowerCase)                                   
                .distinct()                                                 
                .count();                                                  

        System.out.println("Total distinct words (case-insensitive): " + distinctWordCount);


	}
}
