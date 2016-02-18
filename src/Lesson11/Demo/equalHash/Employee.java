package Lesson11.Demo.equalHash;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	
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

	public boolean equals(Employee obj){
		return this.name.equals(obj.getName());
		
	}
	
	@Override 
	public String toString(){
		return "Name: " + getName() + ", Salary: " + getSalary();
	}
}
