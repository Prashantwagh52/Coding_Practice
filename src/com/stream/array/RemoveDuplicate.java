package com.stream.array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		 
		 Set<Integer> set = new HashSet<>();
		 
		 List<Integer> collect = numbers.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
		 
		 List<Integer> no = numbers.stream().distinct().collect(Collectors.toList());
		 
		 collect.forEach(e -> {
			 System.err.println(e);
		 });
	}
}
