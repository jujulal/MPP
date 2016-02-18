package Lesson11.Demo.CompareThenCompare;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Comparator;
public class LambdaLibrary {
	static Function <Employee, String> ByName = e->e.getName();
	static Function <Employee, Double> BySalary = e->e.getSalary();
	
	public final static Function <List<Employee>, List<Employee>> sortBySalary=(emp)->emp.stream().sorted(Comparator.comparing(ByName)).collect(Collectors.toList());

}
