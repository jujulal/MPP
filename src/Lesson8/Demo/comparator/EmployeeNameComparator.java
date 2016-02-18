package Lesson8.Demo.comparator;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
@Override
public int compare(Employee arg0, Employee arg1) {
	// TODO Auto-generated method stub
	return arg0.getName().compareTo(arg1.getName());
}
}
