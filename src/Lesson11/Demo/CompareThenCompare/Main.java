package Lesson11.Demo.CompareThenCompare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	static Function <Employee, String> ByName = e->e.getName();
	static Function <Employee, Double> BySalary = e->e.getSalary();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Jon", 5000.0);
		Employee e2 = new Employee("Jon", 1000.0);
		Employee e3 = new Employee("Riky", 4000.0);
		Employee e4 = new Employee("Aadu", 8000.0);
		
		List<Employee> empList = new ArrayList();
		empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);
	/*	
		List<Employee> sortedList = empList.stream().sorted(Comparator.comparing(ByName))
				.collect(Collectors.toList());*/
		
		List<Employee> sortedList = LambdaLibrary.sortBySalary.apply(empList);
		System.out.println(sortedList);

		System.out.println("Average: "+empList.stream().mapToDouble(e->e.getSalary()).average());

	}

}
