package com.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageAge {

//	Calculate the average age of a list of Person objects using Java streams:

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 35));

		OptionalDouble average = persons.stream().mapToInt(Person::getAge).average();
		average.ifPresent(System.err::println);

		Map<String, Integer> map = persons.stream().collect(Collectors.toMap(Person::getName, Person::getAge));

		map.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

	}
}
