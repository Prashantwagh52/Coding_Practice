package com.stream.practice;

import java.util.Arrays;
import java.util.List;

//Check if a list of integers contains a prime number using Java streams:
public class PrimeNo {

	public boolean primeNo(Integer no) {
		if (no <= 1) {
			return false;
		}
		for (int i = 2; i < no; i++) {
			if (no % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);

		PrimeNo primeNoChecker = new PrimeNo();

		boolean isPrime = numbers.stream().anyMatch(primeNoChecker::primeNo);
		System.err.println("Prime No :" + isPrime);
	}
}
