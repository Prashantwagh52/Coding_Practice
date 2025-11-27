package com.stream.practice;

import java.util.List;

public class FlatMapEmployee {

	String name;
	List<String> phoneNumbers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public FlatMapEmployee(String name, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}

}
