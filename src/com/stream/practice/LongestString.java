package com.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class LongestString {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
//---------------------this will return word -------------------------------------------------		

		Optional<String> max = strings.stream().max(Comparator.comparingInt(String::length));
		max.ifPresent(System.err::print);

//--------------------this will return length---------------------------------------------------		
		OptionalInt max2 = strings.stream().mapToInt(String::length).max();
		System.out.println(max2);
		
	}
}
