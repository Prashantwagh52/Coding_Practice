package com.stream.test;

import java.util.Arrays;
import java.util.List;

public class BankImpl {

	public static void main(String[] args) {
		
		List<BankAccount> transactions = Arrays.asList(
	            new BankAccount(200.0, 0.0, 500.0),   // deposit 200
	            new BankAccount(0.0, 100.0, 0.0),     // withdraw 100
	            new BankAccount(0.0, 700.0, 0.0),     // withdraw 700 (should check)
	            new BankAccount(150.0, 0.0, 0.0)      // deposit 150
	        );
		
		
	}
}
