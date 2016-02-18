package Lesson8.Demo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import Lesson8.Demo.EmployeeNameComparator;
public class Main  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Jon", 5000.0);
		Employee e2 = new Employee("Jon", 1000.0);
		Employee e3 = new Employee("Riky", 4000.0);
		Employee e5 = new Employee("Bimal", 4500.0);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e5);
		
		Collections.sort(empList, new EmployeeNameComparator());
		
		System.out.println(empList);
	}


}
