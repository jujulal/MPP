package Lesson9.Demo.streamreuse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReuseTest {
	public static final List<String> members = Arrays.asList("Brian", "Bob", "Neal", "Raju", "Sara", "Scott");
	public static final List<String> users = Arrays.asList("Bimal","Bibek","Sandeep","Rajan","Prabhat");
	
	//creating a function which generates the stream for reuse
	public Stream<String> listStartWith(List<String> list, String letter){
		return list.stream().filter(name->name.startsWith(letter));
	}
	//reuse the same stream from above function here
	public void printName(String letters){
		 listStartWith(members,letters).forEach(System.out::println);
	}

	public static void main(String[] args) {
		ReuseTest ob = new ReuseTest();
		ob.printName("B");
		ob.printName("S");
	}
}
