package Lesson8.Demo.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFindFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(23,45,3,65,46);
		
		System.out.println("First elment:"+
				myList.stream().findFirst());
		//myList.stream().map(s->s).mapToInt(Integer::parseInt).max();
	}

}
