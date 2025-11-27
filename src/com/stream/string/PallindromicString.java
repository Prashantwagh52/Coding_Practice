package com.stream.string;

import java.util.*;
import java.util.stream.Collectors;

public class PallindromicString {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("radar", "level", "world", "java");

		List<String> collect = words.stream().filter(n -> n.equals(new StringBuilder(n).reverse().toString()))
				.collect(Collectors.toList());

		System.out.println(collect);

	}
}
