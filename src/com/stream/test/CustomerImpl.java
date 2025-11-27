package com.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class CustomerImpl {

	public static void main(String[] args) {

		List<Customer> list = Arrays.asList(new Customer("prashant", 123, 111.23), new Customer("raj", 124, 250.50),
				new Customer("prashant", 123, 300.00), new Customer("neha", 125, 500.00));

		Map<String, Double> totalTransactionAmt = list.stream().collect(
				Collectors.groupingBy(Customer::getCustomerName, Collectors.summingDouble(Customer::getAmount)));

		System.out.println(totalTransactionAmt);
		
		Optional<Entry<String, Double>> max = totalTransactionAmt.entrySet().stream().max(Map.Entry.comparingByValue());
		
		max.ifPresent(e -> {
			System.out.println(e.getKey() + " "+ e.getValue());
		});
	}
}
