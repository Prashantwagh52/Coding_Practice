package com.stream.string;

public class RemoveSpace {

	public static void main(String[] args) {

		String input = "Java is easy and powerful";

		String out = input.replaceAll(" ", "");

		System.err.println(out);
	}
}
