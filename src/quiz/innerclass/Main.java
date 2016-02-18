package quiz.innerclass;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import quizclasses.Employee;
import quizclasses.EmployeeTestData;
import quizclasses.TraderTransactTestData;
import quizclasses.Transaction;

/** SOLVE THE PROBLEMS HERE BY REPLACING LAMBDA EXPRESSIONS IN YOUR PIPELINE SOLUTIONS 
 *  WITH LOCAL INNER CLASSES
 *
 */
public class Main {
	public static void main(String[] args) {
		
		//SAMPLE: Use local inner classes to replace lambdas in your pipeline solution to 
		//this sample problem:
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		
		class NameLength implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getName().length() > 5;
			}
		}
		class BirthYear implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getYearOfBirth() > 1970;
			}
		}
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		
		List<Employee> result = sampleData.stream()
							        .filter(new NameLength())
							        .filter(new BirthYear())
							        .collect(Collectors.toList());
		System.out.println(result);
				
		prob1();
		prob2();
		prob3();
	}
	
	//Transform your pipeline solution to prob1 in the pipeline package so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob1() {
		//use this list 
		
		
		List<Employee> list = EmployeeTestData.getList();
		
	}
	
	///Transform your pipeline solution to prob2 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob2() {
		//use this list	
		
		class filterByYear implements Predicate<Transaction>{

			@Override
			public boolean test(Transaction t) {
				
				return t.getYear()>=2011;
			}
			
		}
		
		class SortByValue implements Comparator<Transaction>{
			@Override
			public int compare(Transaction t1,Transaction t2){
				
				if (t1.getValue()>t2.getValue()) return 1;
				if(t1.getValue()==t2.getValue()) return 0;
				else
					return -1;
				
			}
		}
		
		List<Transaction> list = TraderTransactTestData.getTransactions();
		
		List<Transaction> tranList=list.stream()
									.filter(new filterByYear())
									.sorted(new SortByValue())
									.collect(Collectors.toList());
		
		System.out.println(tranList);
	}
	
	//Transform your pipeline solution to prob3 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob3() {
		//Use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();  
		
	                
	}
}
