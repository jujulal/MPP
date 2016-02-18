package Lesson9.Prob9;

import java.util.ArrayList;
import java.util.List;



public class EBook {
	private List<EBookCopy> copies = new ArrayList<EBookCopy>();
	private String title;
	public EBook(String title, int numCopies) {
		if(numCopies < 1) throw new IllegalArgumentException(
				"NumCopies must be positive");
		this.title= title;
		for(int i = 0; i < numCopies; ++i) {
			addCopy();
		}
	}
	public List<EBookCopy> getCopies() {
		return copies;
	}
	public void addCopy() {
		EBookCopy copy = new EBookCopy(this, copies.size() + 1, true);
		copies.add(copy);
	}
        
}
