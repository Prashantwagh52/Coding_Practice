package com.stream.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordStringConvertToSingle {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Stream", "API", "is", "powerful");

		String collect = words.stream().collect(Collectors.joining(" "));

		System.out.println(collect);
	}
}
