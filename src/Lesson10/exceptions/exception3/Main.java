package Lesson10.exceptions.exception3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ClassA> myList =  new ArrayList();
		myList.add(new ClassA("value1"));
		myList.add(new ClassA("value2"));
		myList.add(new ClassA("value3"));
		
		myList.stream()
		.map(obj->
			{
			try{
					return obj.displaywithException();
			}catch(Exception e){
				throw new RuntimeException(e);
				}
			}).forEach(System.out::println);
			
			
	}

}
