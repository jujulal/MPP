package FinalPractice.prob2;

import java.util.List;
import java.util.stream.Collectors;

import FinalPractice.helperclasses.*;

public class Main {

	public static final BiFunction<BookCopy, LibraryMember, Boolean> IS_CHECKOUT = 
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> booklist= TestData.INSTANCE.getAllBooks();
		
		booklist.get(0).getCopies()
		
		
		List<BookCopy> bookcopyList = booklist.stream().map(x->x.getCopies()

	}

}
