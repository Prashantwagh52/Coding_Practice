package com.stream.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.stream.practice.Employee;

public class GroupingByDepartment {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee("Prashant", "IT", 50000),
			    new Employee("Amit", "HR", 40000),
			    new Employee("Neha", "IT", 70000),
			    new Employee("Sneha", "Finance", 60000),
			    new Employee("Rahul", "HR", 55000)
			);

		
		 Map<String, Optional<Employee>> highestPaidByDept = employees.stream()
		            .collect(Collectors.groupingBy(
		                Employee::getDepartment,
		                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
		            ));
	
		 highestPaidByDept.forEach((a,b) ->{
			 System.out.println(a +" " +b.get());
		 });
	}
}
