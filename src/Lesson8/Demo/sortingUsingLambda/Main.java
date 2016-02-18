package Lesson8.Demo.sortingUsingLambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static List<Employee> sort(List<Employee> list){
		return list.stream()
		.sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
		.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = Arrays.asList(
				new Employee("Ram", 5000.5),
				new Employee("Hari",6500.0),
				new Employee("Hari",500.0),
				new Employee("Abraham",2500.5));
		
		System.out.println("SortedList: " + sort(empList));
	}

}
