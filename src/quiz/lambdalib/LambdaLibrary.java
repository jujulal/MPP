package quiz.lambdalib;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import quizclasses.Employee;


public class LambdaLibrary {
	public final static String IMPLEMENT = "implement!";

	static Function<Employee,String> byName=e->e.getName();
	static Function<Employee,Integer> bySalary=e->e.getSalary();


	//sample query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE
	   = (list, namelength, year) -> list.stream()
	                                     .filter(e -> e.getName().length() > namelength)
	                                     .filter(e -> e.getYearOfBirth() > year)
	                                     .collect(Collectors.toList());


	public final static TriFunction<List<Employee>,Integer,Integer,List<Employee>> sortByNameAndSalary
		=(list,minSalary,maxSalary)->list.stream()
										.filter(e->e.getSalary()>minSalary && e.getSalary()<maxSalary)
										.sorted(Comparator.comparing(byName).reversed().thenComparing(bySalary).reversed())
										.collect(Collectors.toList());


}
