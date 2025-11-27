package com.stream.practice;

public class Transaction {

	String type; // "credit" or "debit"
	int amount;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Transaction(String type, int amount) {
		super();
		this.type = type;
		this.amount = amount;
	}

}
