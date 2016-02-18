package Lesson9.Prob9;

public class EBookCopy {
	private EBook book;
	private int copyNum;
	private boolean isAvailable;
	public EBookCopy(EBook book, int copyNum, boolean isAvailable) {
		this.book = book;
		this.copyNum = copyNum;
		this.isAvailable = isAvailable;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void changeAvailability() {
		isAvailable = !isAvailable;
	}
}
