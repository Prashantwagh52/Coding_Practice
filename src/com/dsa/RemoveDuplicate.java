package com.dsa;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public List<Integer> removeDuplicates(int[] arr) {

		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			set.add(num);
		}

		return new ArrayList<>(set);
	}

	public static void main(String[] args) {

		int[] input = { 1, 2, 2, 3, 4, 5, 5 };

		RemoveDuplicate duplicate = new RemoveDuplicate();
		List<Integer> removeDuplicates = duplicate.removeDuplicates(input);
		System.out.println(removeDuplicates);

		Set<Integer> set = new HashSet<>();

		List<Integer> collect = Arrays.stream(input).boxed().filter(e -> set.add(e)).collect(Collectors.toList());
		System.err.println(collect);

	}
}
