package com.stream.array;
import java.util.Arrays;
import java.util.List;

public class SumOfArray {

	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		 
		 Integer sum = numbers.stream().reduce(0, (a,b) -> a+b);
		 
		 int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
		 
		 System.err.println(sum);
	}
}
