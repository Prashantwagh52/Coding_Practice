package com.stream.test;

public class Customer {

	private String customerName;

	private Integer customerId;

	private Double amount;

	public Customer(String customerName, Integer customerId, Double amount) {

		this.customerName = customerName;
		this.customerId = customerId;
		this.amount = amount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", amount=" + amount + "]";
	}

}
