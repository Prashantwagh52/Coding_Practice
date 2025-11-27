package com.stream.string;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {

	public static void main(String[] args) {
		
		 List<String> words = Arrays.asList("java", "react", "spring");
		 
		 List<String> list = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		 
		 list.forEach(System.err::println);
	}
}
