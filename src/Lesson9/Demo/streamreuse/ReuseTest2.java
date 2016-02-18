package Lesson9.Demo.streamreuse;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class ReuseTest2 {
	//generating stream using BiFunctional reference
	public static BiFunction<List<String>, String, Stream<String>> ListStartWith 
		= (list, letter)->list.stream()
			.filter(name->name.startsWith(letter));
	//list of data	
	public static final List<String> members = Arrays.asList("Brian", "Bob", "Neal", "Raju", "Sara", "Scott");
	public static final List<String> users = Arrays.asList("Bimal","Bibek","Sandeep","Rajan","Prabhat");
	
	public void printName(String letter){
		ReuseTest2.ListStartWith.apply(members,letter).forEach(System.out::println);
	}

	public static void main(String[] args) {
		ReuseTest2 ob = new ReuseTest2();
		ob.printName("B");
		ob.printName("S");
	}
}
