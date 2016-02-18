package Lesson8.Demo.ComparatorInnerClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import Lesson8.Demo.EmployeeNameComparator;
public class EmployeeInfo  {

	static enum SortMethod {BYNAME, BYSALARY};
	
	//now implementing comparator within sort method as inner class
	public void sort(List<Employee> emps, final SortMethod method){
		class EmployeeComparator implements Comparator<Employee>{
			@Override
			public int compare(Employee emp1, Employee emp2){
				if(method==SortMethod.BYNAME)
					return emp1.getName().compareTo(emp2.getName());
				else{
					if(emp1.getSalary()==emp2.getSalary())
						return 0; 
					else if (emp1.getSalary()>emp2.getSalary())
						return 1; 
					else
						return -1;
				}
			}
		}
		Collections.sort(emps, new EmployeeComparator());
	}
	
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
		
		EmployeeInfo empObj = new EmployeeInfo();
		empObj.sort(empList, EmployeeInfo.SortMethod.BYNAME);
		
		//printing after sort by name	
		System.out.println(empList);
		//printing after sort by salary
		empObj.sort(empList, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(empList);
		
		//using lambda
	//	empList.stream()
	//	 .map(x->sort(x))
	//	 .foreach();
		 
	}


}
