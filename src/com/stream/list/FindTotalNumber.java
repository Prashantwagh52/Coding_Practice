package com.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTotalNumber {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10,32, 15, 8, 49, 25, 98, 98, 32, 15);

		List<Integer> collect = myList.stream().map(e -> e + e).collect(Collectors.toList());

		Integer reduce = myList.stream().reduce(0, (a, b) -> a + b);
		
		Map<Integer, Long> collect2 = myList.stream().collect(Collectors.groupingBy(n -> n ,Collectors.counting()));
		
		collect2.forEach((a,b) ->{
			System.out.println(a + " = " +b);
		});
		
		long count = myList.stream().count();

		System.out.println(collect);
		
		System.err.println(reduce);
		
		System.out.println(count);
	}
}
