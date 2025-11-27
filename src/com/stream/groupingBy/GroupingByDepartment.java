package com.stream.groupingBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.stream.practice.Employee;

public class GroupingByDepartment {

	public static void main(String[] args) {

		List<Employee> person = Arrays.asList(
				new Employee("Alice", "IT", 70000), 
				new Employee("Bob", "HR", 50000),
				new Employee("Charlie", "IT", 80000), 
				new Employee("David", "Finance", 60000),
				new Employee("Eve", "HR", 55000));

		Map<String, List<Employee>> collect = person.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		collect.forEach((a, b) -> {
			System.err.println(a + " " + b);
		});

/////////////////////////////////////////////////////////////////////////////////////////

		Map<String, Double> collect2 = person.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

		collect2.forEach((a, b) -> {
			System.err.println(a + " " + b);
		});
//----------------------------------------------------------------------------------------------

		Map<String, Optional<Employee>> collect3 = person.stream().collect(Collectors.groupingBy(n -> n.getDepartment(),
				Collectors.maxBy(Comparator.comparingDouble(p -> p.getSalary()))));

		System.out.println(collect3);
	}
}
