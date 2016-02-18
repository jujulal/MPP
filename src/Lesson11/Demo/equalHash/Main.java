package Lesson11.Demo.equalHash;



public class Main {
	public static void main(String[]arg){
		Employee e1 = new Employee("Jon", 5000.0);
		Employee e2 = new Employee("Jon", 1000.0);
		Employee e3 = new Employee("Riky", 4000.0);
		
		System.out.println(e1.equals(e2));
		
	}

}
