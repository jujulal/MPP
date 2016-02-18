package Lesson10.exceptions.exception3;
import java.io.FileNotFoundException;
public class ClassA {
	private String value;

	public ClassA(String value){
		this.value=value;
	}
	public String displaywithException() throws Exception
	{
		return value;
	}
}
