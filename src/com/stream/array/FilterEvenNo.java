package com.stream.array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNo {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();

		li.add(10);
		li.add(50);
		li.add(20);
		li.add(30);
		li.add(45);

		List<Integer> even = li.stream().filter(e -> e % 2 == 0).sorted().collect(Collectors.toList());

		even.forEach(System.out::println);

	}
}
