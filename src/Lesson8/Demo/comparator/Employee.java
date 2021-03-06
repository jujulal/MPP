package Lesson8.Demo.comparator;

import java.util.Comparator;

public class Employee {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private double salary;
	
	public Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString(){
		return "Name: "+getName()+", Salary: "+getSalary();
	}

	
}
