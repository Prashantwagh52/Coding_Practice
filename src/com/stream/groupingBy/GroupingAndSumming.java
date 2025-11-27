package com.stream.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.stream.practice.Transaction;

public class GroupingAndSumming {

	public static void main(String[] args) {
		
		List<Transaction> transactions = Arrays.asList(
			    new Transaction("credit", 100),
			    new Transaction("debit", 50),
			    new Transaction("credit", 200),
			    new Transaction("debit", 70),
			    new Transaction("credit", 300)
			);
		
		Map<String, Integer> collect = transactions.stream().collect(Collectors.groupingBy(Transaction::getType,
				Collectors.summingInt(Transaction::getAmount)));
		
		System.out.println(collect);
		
		collect.forEach((a, b) -> {
			System.err.println(a + " " + b);
		});
	}
}
